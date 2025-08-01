/**
    Project: Guess the Number
    @author: Mukisa Serufusa
    Objective: Develop a game where the computer selects a random number (Between 1 and 100), 
    and the user has to guess it with hints 
*/

import java.util.Scanner;

public class GuessTheNumber{

    public static void main(String[] args) {
        
        // Variables for the range of random numbers that computer is alloted to use for the game

        int min = 1; // The minimum number
        int max = 50; // The maximum number
        int userAttempts = 0; // Tracks the number of attempts it takes for the user to guess the number

        int computerNumber = (int) (Math.random() * (max - min + 1) + min); // The computer number for the user to guess

        Scanner sc = new Scanner(System.in); // Scanner object for user input 

        int userNumber = -1; // Initalizing with a value as an incorrect guess

        System.out.println("Welcome to Guess the Number!"); // Welcomes the user to the game
        System.out.println("Guess my number. It is between " + min + " and " + max); // Prompts user the guess the random number between 1 and 100

        // Loop that plays the game

        // While the user's number does not equal the computer's number
        while(userNumber != computerNumber){
            userAttempts++; // Increment the number of attempts
            System.out.print("Enter your number: ");
            userNumber = sc.nextInt();

            // If the user's number is less than the computer's random number
            if(userNumber < computerNumber){
                System.out.println("Your number is too low! Go higher!");
            } else if (userNumber > computerNumber){
                System.out.println("Your number is too high! Go lower!");
            } else {
                System.out.println("You guessed it. Well done!");
                System.out.println("Number of attempts: " + userAttempts);
            }
        }
        sc.close();
    }
}