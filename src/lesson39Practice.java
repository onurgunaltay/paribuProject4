import java.util.Scanner;

public class lesson39Practice {
    public static void main(String[] args) {
        int n;
        int sumEven = 0;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Enter a number:");
            n = scan.nextInt();
            if (n % 4 == 0) {
                sumEven += n;
            }
        } while (n % 2 == 0 && n >= 0);

        System.out.println("Total:" + sumEven);

    }
}
