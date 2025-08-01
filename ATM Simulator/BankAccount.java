// Class to handle the user's bank account
public class BankAccount {
    private double accountBalance; // variable for the user's account balance
    private int userPin; // User's pin for login

    // Constructor for initialing the user's initial balance and their inital pin
    public BankAccount(double accountBalance, int userPin){
        this.accountBalance = accountBalance; // Initally sets the user's account balance
        this.userPin = userPin; // Sets the user's account pin
    }

    // Method to validate the user's pin (if it matches or not)
    public boolean validatePin(int userInputPin){
        if(userInputPin == userPin){ // If the entered pin and inital pin match
            return true; // Pin is valid
        } else { 
            return false; // Pin entered is invalid
        }
    }

    // Method to get the user's current account balance
    public double getBalance(){
        return accountBalance; // Receive the user's current account balance
    }

    // Method to deposit money into the account 
    public void deposit(double amount){
        accountBalance += amount; // Adds the deposited amount to the balance
    }

    public boolean withdraw(double amount){
        if(amount > accountBalance){
            System.out.println("Not enough money to withdraw"); // Tell user that there is not enough money to withdraw
            return false; 
        } else {
            accountBalance -= amount; // Money is withdrawn
            return true;
        }
    }
}
