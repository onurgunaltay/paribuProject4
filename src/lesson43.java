
import java.util.Scanner;

public class lesson43 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.print("Enter a number:");
        int number = input.nextInt();
        int basValue;
        int basNumber = 0;
        int tempNumber = number;
        int result = 0;
        int basPov;


        while(number != 0){
            number /= 10;
            basNumber++;
        }


        tempNumber = number;
        while (tempNumber !=0){
            basValue = tempNumber % 10;
            basPov=1;
            for (int i =1; i<=basNumber; i++){
                basPov *= basValue;
            }

            result += basPov;
            tempNumber /= 10;

        }
        if (result == number){
            System.out.println(number + "İts an Armstrong number");
        }else{
            System.out.println(number + "its not an Armstrong number");
        }




        /*
        //int a = 2451, basamakSayısı=0, numberCounter=0;

        // Basamak bulma işlemi
        // 2451 / 10 = 245
        // 245 / 10 = 245
        // 24 / 10 = 24
        // 2 / 10 = 2
        // 0 / 10 = 0

       // System.out.println(a);

        //while ( a != 0){
         //   a = a / 10;


          //  numberCounter ++;


        //}

        // Bir sayının son basanmağını bulma
        // 2541 % 10 = 1
        //int b = 2451;
        //int c = b%10;


        int sub = 2, sup = 3 ;
        int result =1;
        for(int i =1;i<=sup;i++){
        result *= sub;
        }
        System.out.println(result);

        */





    }

}
