public class MyClass {

    private int number;
    private char a;

    public MyClass(int number,char a){
        this.a = a;
        this.number = number;
    }

    public void make(MyClass obj){
        setA(obj.getA());
        setNumber(obj.getNumber());
        int num = (int) obj.getA();
        num++;
        obj.setA((char) num);
        obj.setNumber(obj.getNumber() + 1);
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "number=" + number +
                ", a=" + a +
                '}';
    }

    public void setA(char a) {
        this.a = a;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public char getA() {
        return a;
    }

    public int getNumber() {
        return number;
    }
}
