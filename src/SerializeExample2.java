import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.*;



public class SerializeExample2 {

    public static void main(String[] args) {

       Person tom = new Person("Tom", "Johns", 40, false, new House(123));
        String FileName = "text/person.txt";
       writePersonToFile(tom, FileName);
       writePersonToJSon();
       writeAndReadFromJSon();

        Person personFromFile=readPersonFromFile(FileName);
        System.out.println(personFromFile);
    }
        public static Person readPersonFromFile(String FileName){
        Person person = null;
        try(FileInputStream fis=new FileInputStream(FileName);
            ObjectInputStream ois= new ObjectInputStream(fis)){
            person = (Person)ois.readObject();
        }catch(IOException|ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        return person;
        }
        public static void writePersonToFile(Person person, String FileName){
            try(FileOutputStream fos=new FileOutputStream(FileName);
                ObjectOutputStream oos=new ObjectOutputStream(fos)){
                oos.writeObject(person);
            }catch(IOException e){
                System.out.println(e.getMessage());
            }
        }

        public static void writePersonToJSon(){
        ObjectMapper mapper=new ObjectMapper();
            ObjectWriter writer=mapper.writer(new DefaultPrettyPrinter());
            Person tom=new Person("Tom","Johns",40,false,new House(23));
            try{
                writer.writeValue(new File("text/person.json"),tom);
            }catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
        private static void writeAndReadFromJSon(){
            ObjectMapper mapper=new ObjectMapper();
            ObjectWriter writer=mapper.writer(new DefaultPrettyPrinter());
            Person tom=new Person("Tom","Johns",40,false,new House(23));
            try{
                File file=new File("text/person.json");
                writer.writeValue(file,tom);
                Person fromJSon=mapper.readValue(file,Person.class);
                System.out.println(fromJSon);
            }catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
