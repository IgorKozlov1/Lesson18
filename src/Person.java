import java.io.Serializable;

public class Person implements Serializable {

    //private static final long serialVersionUID=-8344678787L;

    private static String gender = "male";
    private /**transient**/ String firstName;
    private String lastName;
    private int age;
    private boolean isSmoker;
   // private String newField;
    Person(String firstName, String lastName, int age, boolean isSmoker,House house ){
        this.age = age;
        this.firstName = firstName;
        this.isSmoker = isSmoker;
        this.lastName = lastName;
        this.house=house;
    }

        private House house;




    public static String getGender() {
        return gender;
    }

    public static void setGender(String gender) {
        Person.gender = gender;
    }

    public boolean isSmoker() {
        return isSmoker;
    }

    public void setSmoker(boolean smoker) {
        isSmoker = smoker;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", isSmoker=" + isSmoker +
                '}';
    }


}