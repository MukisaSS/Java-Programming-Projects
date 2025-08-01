/**
    @author Mukisa Serufusa
    Objective: Create a program to calculate the Body Mass Index based on user input of height and weight
*/

import java.util.Scanner; // Importing the Scanner class

public class BMI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object

        System.out.println("Welcome to the BMI Index Calculator!"); // Welcomes user to the program

        System.out.print("To find out your BMI (Body Mass Index), first enter your weight: "); // Prompts user to enter their weight
        int userWeight = sc.nextInt(); // Weight entered by the user
        
        System.out.print("Next, enter your height: "); // Prompts the user to enter their height
        int userHeight = sc.nextInt(); // Height entered by the user
        
        double userBMI = (userWeight * 703) / (userHeight * userHeight); // Calculates the user's BMI index

        // Output the user's BMI and their weight status
        System.out.println("Your BMI (Body Mass Index) is " + userBMI);

        // BMI Index Gauage
        if (userBMI <= 18.4){ // If the user's BMI is less than or equal to 18.4
            System.out.println("Weight status: You're underweight"); // Indicates the user is under weight
        } else if (userBMI >= 18.5 && userBMI <= 24.9){ // If the user's BMI is between 18.5 and 24.9
            System.out.println("Weight status: Normal"); // Indicates the user is at normal weight
        } else if (userBMI >= 25.0 && userBMI <= 39.9){ // If the user's BMI is between 25.0 and 39.9
            System.out.println("Weight status: Overweight"); // Indicates the user is over weight
        } else { // Assuming the user's BMI is greater than or equal to 40.0
            System.out.println("Weight status: Obese"); // Indicates the user is obese
        }

        System.out.println(); // Line break

        // BMI Table Information for the user
        System.out.println("BMI (Body Mass Index) Table");
        System.out.println("-----------------------------------");
        System.out.println("(BMI)                      (Status)");
        System.out.println("------------------------------------");
        System.out.println("≤ 18.4                     Underweight");
        System.out.println("18.5 - 24.9                Normal");
        System.out.println("25.0 - 39.9                Overweight");
        System.out.println("≥ 40.0                     Obese");
        System.out.println();

        sc.close();
    }
}