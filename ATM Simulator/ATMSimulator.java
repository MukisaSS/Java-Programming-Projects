// Class to handle user interaction with the bank account (the bank account class)

import java.util.Scanner; // importing the scanner class

public class ATMSimulator {
    private BankAccount myAccount; // Object for the the user's bank account
    private Scanner sc; // Scanner object for user input

    // Constructor to initalize the user's account and to accept 
    public ATMSimulator(){
        this.myAccount = new BankAccount(1000.00, 1234); 
        this.sc = new Scanner(System.in);
    }

    public void beginATM(){
        System.out.println("Welcome to Capital Two!");

        System.out.print("Enter your pin here: " );
        int myPin = sc.nextInt();
        int choice;

        boolean validPin = myAccount.validatePin(myPin);

        if(validPin){
            while(true){
                displayMenu(); // Show the menu

                System.out.print("What would you like to do next? ");
                choice = sc.nextInt();

                switch(choice){
                    case 1: 
                        handleCheckBalance();
                        break;
                    case 2: 
                        handleDeposit();
                        break;
                    case 3: 
                        handleWithdraw();
                        break;
                    case 4: 
                        System.out.println("Exiting...");
                        System.out.println("Thanks for your time. Have a good day!");
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid choice! Try again!");
                }   
            }
        } else {
            System.out.println("Access denied due to Invalid pin");
        }
    }

    private void displayMenu(){
        System.out.println("1. Check Balance");

        System.out.println("2. Deposit");

        System.out.println("3. Withdraw");

        System.out.println("4. Exit");
    }

    public void handleCheckBalance(){
        double currentBalance = myAccount.getBalance(); // Retrieves the user's balance
        System.out.println("Your balance is $ " + currentBalance);
    }

    public void handleDeposit(){
        double userDepositFunds;

        while(true){
            System.out.print("How much money do you want to deposit? ");
            userDepositFunds = sc.nextDouble();

            if (userDepositFunds < 0){
                System.out.println("Invalid option! Please try again.");
            } else {
                break;
            }
        }
        myAccount.deposit(userDepositFunds);
        System.out.println("Transaction successful! Your account balance is now $" + myAccount.getBalance());
    }

    public void handleWithdraw(){
        double userWithdrawFunds;

        while(true){
            
            System.out.print("How much do you want to withdraw? ");
            userWithdrawFunds = sc.nextDouble();

            if(userWithdrawFunds < 0){
                System.out.println("Invalid option! Please try again.");
            } else if(userWithdrawFunds > myAccount.getBalance()){
                System.out.println("Transaction failed due to insufficient funds.");
            } else if(myAccount.withdraw(userWithdrawFunds)){
                System.out.println("Transaction successful!");
                System.out.println("Your balance is now $" + myAccount.getBalance());
                break;
            } else {
                System.out.println("Transaction failed. Please try again!");
            }
        }
    }

    public static void main(String[] args) {
        
       ATMSimulator myUser = new ATMSimulator();

       myUser.beginATM();
    }
}
