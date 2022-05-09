import java.util.Scanner;

public class lesson45practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayisi: ");
        int number = input.nextInt();

        for (int i=1; i<=number; i++){

            for (int space=1; space <= (number - i); space++)    // yildizdan once bosluk yazdirma
                System.out.print(" ");

            for (int star=1; star <= (2*i)-1; star++)         // yildiz yazdirma
                System.out.print("*");

            System.out.println();
        }

        for (int i=number-1; i>=1; i--){                            // ters ucgen yazdirma

            for (int space=(number - i); space>0; space--)
                System.out.print(" ");

            for (int star=(2*i)-1; star>0; star--)
                System.out.print("*");

            System.out.println();
        }

    }
}