import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyClass a = new MyClass(new int [] {1,2,3,45,5,6});
        int [] array = createArray(a);
        System.out.println("Копія масиву з об'єкта: "+ Arrays.toString(array));

        int [] b = {324,324,234,24,324};
        MyClass k = createArray(b);
        System.out.println("Новий об'єкт який стрвориний на основі масива: " + Arrays.toString(k.numbers));
    }

    static int [] createArray(MyClass obj){
        return Arrays.copyOf(obj.numbers,obj.numbers.length);
    }

    static MyClass createArray(int [] a){
        return new MyClass(Arrays.copyOf(a,a.length));
    }
}