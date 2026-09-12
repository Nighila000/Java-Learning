import java.util.Scanner;
public class Bankingprogram {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //Declare variables
        double balance = 1000;
        boolean isRunning = true;
        int choice;
        while (isRunning) {
            //Display menu
            System.out.println("***********\nBanking Program\n***********");
            System.out.println("1.Show balance\n2.Deposit\n3.Withdraw\n4.Exit\n***********\n");
            //GET AND PROCESS USERS CHOICE
            System.out.print("Enter your choice(1-4): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid");
            }
        }
        System.out.println("***************************");
        System.out.println("Thank you! Have a nice day!");
        sc.close();
    }

    //showBalance
    static void showBalance(double balance){
        System.out.printf("$%.2f\n",balance);
    }
    //Deposit
    static double deposit(){
        System.out.print("Enter the amount to be deposited: ");
        double amount = sc.nextDouble();
        if(amount < 0 ){
            System.out.println("Amount cant be negative!");
            return 0 ;
        }
        else{
            return amount;
        }
    }
    static double withdraw(double balance){
        System.out.print("Enter the amount to be withdrawn: ");
        double amount =  sc.nextDouble();
        if(amount > balance ){
            System.out.println("Insufficient Balance");
            return 0 ;
        }
        else if(amount < 0){
            return 0;
        }
        else{
            return amount;
        }

    }
}