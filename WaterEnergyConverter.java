/* Christopher Clausen
    3/26/2022
    Module 2 Assignment
    This program calculates the energy needed to heat water. */
import java.util.Scanner;

    public class WaterEnergyConverter {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Prompt the user to enter the amount of water in kg
            System.out.print("Enter an amount of water in kg: ");
            double waterMass = input.nextDouble();

            // Prompt user to enter the initial and final temp of the water
            System.out.print("Enter the initial and final temperature of " +
                "the water respectively: ");
            double initialTemperature = input.nextDouble();
            double finalTemperature = input.nextDouble();

            // Compute the formula
            double Q = waterMass * (finalTemperature - initialTemperature) * 4184;

            // Display results
            System.out.println("The energy needed to heat water from " + 
                initialTemperature + "º Celsius to " + finalTemperature + 
                    "º Celsius is " + Q + " Joules.");
        }
}
