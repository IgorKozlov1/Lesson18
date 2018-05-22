import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
/**
public class SerializeExample1 {

    public static void main(String[] args) {
    Person tom= new Person("Tom","Johns",40,false,new House(123));
    String FileName="text/person.txt";
    writePersonToFile(tom,FileName);
}
    public static void writePersonToFile(Person person, String FileName){
        try(FileOutputStream fos=new FileOutputStream(FileName);
            ObjectOutputStream oos=new ObjectOutputStream(fos)){
            oos.writeObject(person);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
**/