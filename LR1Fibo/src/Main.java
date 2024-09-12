//	Визначити, які числа серед перших N чисел Фібоначчі можна задати у формі
//  (на 1 менше ніж певний квадрат).
import java.util.Scanner;

public class Main {
    static Fibo[] arr;
    static int fibo;


    /**
     * Counts value of every position in Fibonacci sequence and ads it to the array of objects
     * @param args
     */
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Which number of Fibos");
         fibo = myObj.nextInt();
        arr = new Fibo[fibo];
        arr[0] = new Fibo(0,0);
        arr[1] = new Fibo(1,1);

        for (int i = 2; i < fibo; i++) {
            int c = arr[i-1].getValue() + arr[i-2].getValue();

            arr[i] = new Fibo(i,c);
        }
    Check();
    }
    /**
     * Checking numbers
     */
    public static void Check(){
        for(int i = 0;i < fibo;i++) {
            double res = Math.sqrt(arr[i].getValue() + 1);
            if ((int) res == res) {
                System.out.println(i + "'s Number " + " Value: " + arr[i].getValue() + " (" + (int) res + "*" + (int) res + "-1)");
            } else {
                System.out.println(i + "'s Number " + " Value: " + arr[i].getValue());
            }
        }
    }


}


