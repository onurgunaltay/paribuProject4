
import java.util.Scanner;

public class lesson42Practice {
    public static void main(String[] args) {
        int n,k;

        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz:");
        n = input.nextInt();

        System.out.print("Üs olacak sayı:");
        k = input.nextInt();
        int total=1;



        for (int i=1; i<=k; i++){
            total *= n;

        }
        System.out.println("Cevap :" + total);
    }
}
