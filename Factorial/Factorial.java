/**
    @author Mukisa Serufusa
    Objective: Create a program to calculate the factorial of a number, given by the user
*/

import java.util.Scanner; // Importing the Scanner class

public class Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Scanner object

        System.out.println("Welcome to the Factorial Calculator!"); // Welcomes user to the program
        System.out.print("Enter a number to find its factorial: "); // Prompts user to enter a number

        int n = sc.nextInt(); // Number entered by the user
        int factorial = 1; // Variable holds the factorial result

        // Loop to calculate the factorial
        for(int i = 1; i <= n; i++){
            factorial *= i; // Multiples numbers up to the user's number
        }

        System.out.println("The factorial of " + n + " is " + factorial); // Output the factorial of the user's number

        sc.close();
    }
}