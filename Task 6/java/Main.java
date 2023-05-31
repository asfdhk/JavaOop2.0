import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Number [] s = create(10);
        show(s);
        System.out.println(max(s));
    }

    static Number [] create(int length){
        Number [] bins = new Number[length];
        for (int i = 0;i<length;i++){
            bins[i] = new Number( (int) (Math.random() *100));
        }
        return bins;
    }

    static void show(Number[] obj){
        System.out.print("[ ");
        for(int k=0;k<obj.length;k++){
            System.out.print(obj[k].getNumber() +" ");
        }
        System.out.print("]");
        System.out.println();
    }

    static int max(Number [] a){
        int b = 1;
        int m =0;
        for (int i = 0;i<a.length;i++){
            if (b<a[i].getNumber()){
                b = a[i].getNumber();
                m = i+1;
            }
        }
        System.out.println( "Полження максимального числа: "+m);
        return b;
    }
}