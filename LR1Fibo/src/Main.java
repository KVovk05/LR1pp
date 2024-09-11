//	Визначити, які числа серед перших N чисел Фібоначчі можна задати у формі
//  (на 1 менше ніж певний квадрат).
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Fibo[] arr;
        Scanner myObj = new Scanner(System.in);

        System.out.println("Which number of Fibos");
        int fibo = myObj.nextInt();
        arr = new Fibo[fibo];
        arr[0] = new Fibo(0,0);
        arr[1] = new Fibo(1,1);

        for (int i = 2; i < fibo; i++) {
            int c = arr[i-1].getValue() + arr[i-2].getValue();

            arr[i] = new Fibo(i,c);
            double res = Math.sqrt(arr[i].getValue() + 1);
            if((int)res == res){
                System.out.println(i+"'s Number " +" Value: " + arr[i].getValue() + " (" + (int)res + "*" + (int)res + "-1)");
            }
        }
    }
}


