
import java.util.Scanner;

public class loop1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int k;
        System.out.print("Enter your number:");
        k = input.nextInt();

        int i = 0;
        double sum = 0, count = 0;
        while (i <= k) {
            i++;
            if (i % 3 == 0 & i % 4 == 0) {
                sum = sum + i;
                count++;
                System.out.println(i);

            }
        }
        double avarage = sum / count;
        System.out.println("İts the avarage number of you all entered whıch can be divided 3 and 4 " + avarage);

    }
}
