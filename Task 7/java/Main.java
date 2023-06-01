public class Main {
    public static void main(String[] args) {
        Obj a = createList(5);
        show(a);
    }
    static Obj createList(int n) {
        Obj obj = new Obj();
        obj.setNumber(1);
        Obj a = obj;
        for (int i = 0; i < n - 1; i++) {
            a.next = new Obj();
            a.next.setNumber(a.getNumber() + 1);
            a = a.next;
            if (a.next == obj) {
                break;
            }
        }
        a.next = obj;
        return obj;
    }
    static void show(Obj obj) {
        String t = "";
        Obj a = obj;
        do {
            t += a.getNumber() + " ";
            a = a.next;
        } while (a != obj);
        System.out.println(t);
    }
}