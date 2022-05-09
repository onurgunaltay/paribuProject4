
import java.util.Scanner;


public class lesson41 {
    public static void main(String[] args) {
        // n! = 1 * 2 * 3 * 4 * .... *n

        Scanner scan = new Scanner(System.in);
        System.out.print("Factoriel Number: ");
        int n = scan.nextInt();
        int total = 1;

        for(int i =1; i<=n; i++){
            total *= i;
        }
        System.out.println(n + ". Factoriel :" + total);
    }
}
