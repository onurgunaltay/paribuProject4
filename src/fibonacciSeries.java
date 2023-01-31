
import java.util.Scanner;


public class fibonacciSeries {
    public static void main(String[] args) {
        // Fibonacci Series: 0,1,1,2,3,5,8,13,21...

        Scanner input = new Scanner(System.in);
        System.out.print(" How many numbers do you want your fibonacci serie have? :  ");
        int n = input.nextInt();

        int n1=0;
        int n2=1;
        int total;

        System.out.print( n + " number of fibonacci series :  ");


        for ( int i=1; i<= n; i++){
            System.out.print(n1 + " , ");

            total = n1 + n2;
            n1 = n2;
            n2= total;
        }

    }
}
