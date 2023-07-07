import java.util.*;

public class ATM {
    public static void main(String[] args) {

        int pin = 2020;
        int balance = 1000;

        int Deposit = 10;
        int withdraw = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Insert Your Card ");
        System.out.println("Enter your pin number : ");

        int password = scanner.nextInt();

        if (password == pin) {

            while (true) {
                System.out.println("press 1 to check your balance");
                System.out.println("press 2 to Deposit amount");
                System.out.println("press 3 to Withdraw amount");
                System.out.println("press 4 to take receipt");
                System.out.println("press 5 to Exit");

                int opt = scanner.nextInt();
                switch (opt) {
                    case 1:
                        System.out.println(" your current balance is " + balance);
                        break;
                    case 2:
                        System.out.println("How much amount did you want to ADD to your account");
                        Deposit = scanner.nextInt();
                        System.out.println("Successfully credited");
                        balance = Deposit + balance;
                        // 10000 = 100 + 10000
                        // balance = 10100
                        break;
                    case 3:
                        System.out.println("How much amount did you want to take ");
                        withdraw = scanner.nextInt();
                        if (withdraw > balance) {
                            System.out.println("Your balance is insufficient");
                            System.out.println("try less than your available balance");
                        } else {
                            System.out.println("Successfully taken");
                            balance = balance - withdraw;
                            // balance = 10100= 10100 - 100
                            // balance = 10000
                        }
                        break;
                    case 4:
                        System.out.println("Welcome to All in one mini ATM");
                        System.out.println("Available balance is " + balance);
                        System.out.println("Amount deposited    " + Deposit);
                        System.out.println("Amount taken           " + withdraw);
                        System.out.println("Thanks for Visiting ATM Branch");

                        break;
                    default:
                        System.out.println("press the number below 5 ");
                        break;
                }
                if (opt == 5) {
                    System.out.println("Thank You");
                    break;
                }
            }
        }

        else {
            System.out.println(" Please Enter Correct PIN");
            System.out.println(" Swap Out Your Card");
        }

    }
}