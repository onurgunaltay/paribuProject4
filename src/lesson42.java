
import java.util.Scanner;

public class lesson42 {
    public static void main(String[] args) {
        int n,k;
        Scanner input = new Scanner(System.in);

        System.out.print("Üssü alınacak sayı :");
        n = input.nextInt();

        System.out.print("Üs olacak sayı :");
        k = input.nextInt();

        // 3^4 = 3 * 3 * 3 * 3
        int i = 1;
        while (i <= k){
            System.out.println(i);
            i++;
        }
    }
}
