


import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        /*
        for( boolean run = true ; run;){
            System.out.print("Enter your number:");
            number = input.nextInt();
            if (number < 0){
                run = false;
            }
        }


        System.out.print("Enter your number:");
        number = input.nextInt();
        while (number > 0) {
            System.out.print("Enter your number:");
            number = input.nextInt();

        }

        do {
            System.out.print("Enter your number:");
            number = input.nextInt();
        } while (number > 0);




        for( int i=1 ; i <=10 ; i++){
            System.out.println(i);
        }


        int i=1;
        while ( i <=10 ){
            System.out.print(i + ",");
            i++;
        }



        for (int i=1 ; i<=10; i++){
            if (i==5){
                continue;
            }
            System.out.println(i);
        }

         */
        for ( int k = 0; k<9; k++){
            System.out.print("*");
            if (k==3)
                break;

        }
    }

}
