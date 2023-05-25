public class Main {
    public static void main(String[] args) {
        MyClass A = new MyClass(10,'A');
        MyClass B = new MyClass(12,'C');
        System.out.println(A);
        System.out.println(B);
        A.make(B);
        System.out.println("----------------------");
        System.out.println(A);
        System.out.println(B);
    }
}