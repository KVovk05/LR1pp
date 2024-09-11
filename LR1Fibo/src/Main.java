import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int a = 1;
        int b = 1;
        Fibo[] arr;


        System.out.println("Which number of Fibos");
        int fibo = myObj.nextInt();
        for (int i = 3; i <= fibo; i++) {
            int c = a + b;
            a = b;
            b = c;
            double res = Math.sqrt(b + 1);
            if((int)res == res){
                System.out.println(b + "(" + (int)res + "*" + (int)res + "-1)");
            }
        }
    }
}


