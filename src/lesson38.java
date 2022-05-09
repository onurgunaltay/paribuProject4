
import java.util.Scanner;

public class lesson38 {
    public static void main(String[] args) {
        int k, i=1;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your number:");
        k = input.nextInt();

        while ( i<=k ){
            i++;
            if(i%2==0){
                System.out.println(i);
            }else{
                System.out.println( i + " :this is not an even number");
            }

        }
    }
}
