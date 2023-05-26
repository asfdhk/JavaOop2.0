import java.security.PublicKey;

public class MyClass {

    private int number;

    public MyClass (int number){
        this.number = number;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "number=" + number +
                '}';
    }

    public MyClass copy(int a){
        return new MyClass(a);
    }

    public MyClass copy(){
        return new MyClass(getNumber());
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
