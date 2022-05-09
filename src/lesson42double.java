
import java.util.Scanner;


public class lesson42double {
    public static void main(String[] args) {

        //Basamak sayısı bulma
        int basNumber=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = input.nextInt();
        int tempNumber = number;
        int result=0;
        int basValue;


        while ( tempNumber != 0){
            tempNumber /= 10;
            basNumber++;

        }
        System.out.println( basNumber + " basamaklı sayı girdiniz.");



        while (number != 0){
            basValue=number%10;
            result+=basValue;
            number=number/10;


        }


        System.out.println(" Basamak sayılarının toplamı: " + result);



    }
}
