
import java.util.Scanner;


public class MinMaxDeğer48 {
    public static void main(String[] args) {

        int howMany, number, min = 0 , max = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers will you enter : ");
        howMany = input.nextInt();

       for ( int i=1; i<=howMany; i++){

           System.out.print( i + ".number : ");
           number = input.nextInt();

           if( number >= max){
               max = number;
           }
           if ( number <= min){
               min = number;
           }
       }

        System.out.println("Max value : " + max);
        System.out.println("Min value : " + min);


    }
}
