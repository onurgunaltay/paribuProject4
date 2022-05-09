
import java.util.Scanner;


public class lesson46 {
    public static void main(String[] args) {
        String userName,password;
        Scanner input = new Scanner(System.in);

        int right = 3;
        int balance = 1500;
        int select;
        while( right > 0){
            System.out.print("Enter your username: ");
            userName= input.nextLine();
            System.out.print("Password : ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")){
                System.out.println("Hello , welcome to Kodluyoruz bank ");
                do {
                    System.out.print("1-Deposit Money\n" +
                            "2-Withdraw Money\n" +
                            "3-Check your balance\n" +
                            "4-Log out");
                    System.out.print("Please choose your process :  ");
                    select = input.nextInt();
                    if (select == 1){
                        System.out.print("Deposit Money : ");
                        int price = input.nextInt();
                        balance += price;
                    }else if(select == 2){
                        System.out.print("Withdraw Money : ");
                        int price = input.nextInt();
                        if (price > balance){
                            System.out.print("You dont have enough balance to withdraw this amount.");
                        }else{
                            balance -= price;
                        }
                    }else if(select == 3){
                        System.out.print("Your balance " + balance );
                    }

                }while( select != 4);
                System.out.println("See you later.Good Bye");
                break;
            }else{
                right--;
                System.out.println("Worng username or passord , try again. ");
                if (right == 0){
                    System.out.println("Your account has been blocked. Please get contact wıth bank consultant ");
                }else{
                    System.out.println("Your remaining rights : " + right);
                }

            }
        }

    }
}
