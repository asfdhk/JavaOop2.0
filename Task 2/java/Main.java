public class Main {
    public static void main(String[] args) {
        Number a = new Number(65);
        Symbol b = new Symbol('C');
        System.out.println(a);
        System.out.println(b);

        b.makeSymbol(a);
        System.out.println(b);
    }
}