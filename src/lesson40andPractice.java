
import java.util.Scanner;


public class lesson40andPractice {
    public static void main(String[] args) {

        int n;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your limit number:");
        n = input.nextInt();

        for (int i =1; i <=n; i*=4){
            System.out.println("Exponential numbers of 4:" +i);
        }
        for (int i =1; i <=n; i*=5){
            System.out.println("Exponential numbers of 5:" +i);
        }
    }
}
