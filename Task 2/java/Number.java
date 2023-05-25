public class Number {

    private int number;

    public Number (int number){
        this.number = number;
    }

    @Override
    public String toString() {
        return "Number{" +
                "number=" + number +
                '}';
    }

    public void makeNumber(Symbol symbol){
        setNumber((int) symbol.getA());
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
