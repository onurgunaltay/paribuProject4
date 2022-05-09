
import java.util.Scanner;


public class lesson46practice {
    public static void main(String[] args) {
        String userName, password;
        int balance = 1500 , price;
        int select;
        int right = 3;

        Scanner input = new Scanner(System.in);

        while (right > 0) {
            System.out.print("Enter your username :");
            userName = input.nextLine();
            System.out.print("Enter your password :");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev321")){
                System.out.print("Hello, welcome to Kodluyoring Bank ");

                do {
                    System.out.println("1-Deposit Money\n" +
                                    "2-Withdraw Money\n" +
                                    "3-Check your balance\n" +
                                    "4-Log out");
                    System.out.print("Please select your process :");

                    select = input.nextInt();

                    switch (select){
                        case 1:
                            System.out.print("Amount of Money : ");
                            price = input.nextInt();
                            balance += price;
                            break;

                        case 2:
                            System.out.println("Amount of Money : ");
                            price = input.nextInt();
                            if(price > balance){
                                System.out.println("Your dont have enough money to thıs process.");
                            }else{
                                balance -= price;
                                break;
                            }

                        case 3:
                            System.out.println("Balance of your account : " + balance );
                            break;
                    }



                }while (select != 4);
                System.out.println("See you again, Good Bye");
                break;

            }else{
                right--;
                System.out.println("Wrong username or password. Please try again.");
                if(right == 0){
                    System.out.println("Your account has been blocked.Please get contact with consultant.");
                }else{
                    System.out.println("Your remaining rights : " +  right);
                }
            }

        }

    }
}
