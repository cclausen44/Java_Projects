/* Christopher Clausen
 * 6/4/2022
 * Module 3 Assignment
 * This program lets a user play the game of rock, paper, scissors
 * against the computer. */

import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {

        // Generate computer's choice
        int computerChoice = (int)(Math.random() * 3 + 1);

        int computerRock = computerChoice % 1;
        int computerPaper = computerChoice % 2;
        int computerScissors = computerChoice % 3;

        String computerMessage = "";
        if (computerChoice == 1)
            computerMessage = "rock";
        else if (computerChoice == 2)
            computerMessage = "paper";
        else if (computerChoice == 3)
            computerMessage = "scissors";

        // Prompt user to pick rock, paper, or scissors
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your choice, 1 is rock, " + 
            "2 is paper, 3 is scissors: ");
        int guess = input.nextInt();

        int guessRock = guess % 1;
        int guessPaper = guess % 2;
        int guessScissors = guess % 3;

        String guessMessage = "";
        if (guess == 1)
            guessMessage = "rock";
        else if (guess == 2)
            guessMessage = "paper";
        else if (guess == 3)
            guessMessage = "scissors";

        // Display player choice and computer choice
        System.out.println("You chose " + guessMessage + ".");
        System.out.println("The computer chose " + computerMessage + ".");

        // Check guess
        if (guess == computerChoice)
            System.out.println("You tied!");
        else if(guessRock == computerPaper
             || guessPaper == computerScissors
             || guessScissors == computerRock)
             System.out.println("You lost!");
        else
            System.out.println("You win!");

    }
}
