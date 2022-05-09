
import java.util.Scanner;

public class lesson39 {
    public static void main(String[] args) {
        int n;
        int sum = 0;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Enter your number:");
            n = scan.nextInt();
            if (n % 2 == 1) {
                sum += n;
            }
        } while (n > 0);

        System.out.println("Total:" + sum);

    }
}
