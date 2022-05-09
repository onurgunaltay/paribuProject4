
import java.util.Scanner;


public class lesson47practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter n1 number : ");
        int n1 = input.nextInt();

        System.out.print("Enter n2 number : ");
        int n2 = input.nextInt();

        int k = n1;
        int ebob =1;
        int ekok =1;

        while (k>1){
            if ( n1 % k == 0 && n2 % k == 0){
                ebob = k;
                break;
            }
            k--;
        }
        System.out.println("EBOB=" + ebob);

        ekok = (n1 * n2) / ebob;
        System.out.println("EKOK=" + ekok);



    }
}
