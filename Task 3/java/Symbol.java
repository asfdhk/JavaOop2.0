public class Symbol {

    private char a;

    public Symbol (char a){
        this.a = a;
    }

    @Override
    public String toString() {
        return "Symbol{" +
                "a=" + a +
                '}';
    }

    public void setA(char a) {
        this.a = a;
    }

    public char getA() {
        return a;
    }
}
