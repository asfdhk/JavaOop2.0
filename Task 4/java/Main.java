public class Main {
    public static void main(String[] args) {
        MyClass a = new MyClass(124);
        System.out.println(a);
        System.out.println(a.copy());
        System.out.println(a);
        System.out.println(a.copy(56));
        System.out.println(a);
    }
}