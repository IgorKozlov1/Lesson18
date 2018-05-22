/**import java.io.*;

public class SerializeExamples {

    public static void main(String[] args) {
        Person tom=new Person("Tom","Johns",40,false);
        try(DataOutputStream dos=new DataOutputStream(new FileOutputStream("text/tom.txt"));
        DataInputStream dis=new DataInputStream(new FileInputStream("text/tom.txt"))){
            dos.writeUTF(tom.getFirstName());
            dos.writeUTF(tom.getLastName());
            dos.writeInt(tom.getAge());
            dos.writeBoolean(tom.isSmoker());
            System.out.println("tom saved");

            String name=dis.readUTF();
            String lastName=dis.readUTF();
            int age=dis.readInt();
            boolean isSmoker=dis.readBoolean();
            Person tomFromFile=new Person(name,lastName,age,isSmoker);
            System.out.println(tomFromFile);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

}  **/