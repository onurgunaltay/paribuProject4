
import java.util.Scanner;


public class perfectNumber {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();

        int perfNumber = 0;

        for (int i = 1; i <number; i++){
            if ( number % i == 0){
                perfNumber += i;
            }
        }
        if ( perfNumber == number ){
            System.out.print( number + " is a perfectnumber.");

        }else{
            System.out.print( number + " is not a perfectnumber.");
        }

    }
}
