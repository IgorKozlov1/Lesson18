import java.io.Serializable;

public class House implements Serializable {

    private int number;
    public House(int number){
        this.number=number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}