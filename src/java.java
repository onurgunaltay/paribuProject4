import java.util.Scanner;

public class java {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int nSayi;
        int max = 0,min= 0;


        System.out.print("Kaç tane sayı gireceksiniz: ");
        nSayi = input.nextInt();
        for (int i = 1; i <= nSayi; i++) {
            System.out.print(i + ".sayıyı giriniz : ");
            int x = input.nextInt();


            if (x > max) {
                if (min == 0) {
                    min = x;
                }
                max = x;
            }
            if (x < min) {
                if (max == 0) {
                    max = x;
                }
                min = x;
            }








        } System.out.println("En Büyük Sayı : " + max);
        System.out.println("En Küçük Sayı : " + min);




    }
}
