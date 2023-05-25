public class Main {
    public static void main(String[] args) {
        System.out.println(create('b'));
    }

    public static Symbol create(char b){
        return new Symbol(b);
    }
}