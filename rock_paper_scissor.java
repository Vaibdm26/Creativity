//Rock Paper Scissor Game in Java
import java.util.Scanner;
import java.util.Random;

public class rock_paper_scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        while (true) {
            //-----Rock Paper Scissor Game------//
            System.out.println("Enter Your Choice: 1 For Rock, 2 For Paper, 3 for Scissors. Enter 0 to quit.");

            int choice1 = sc.nextInt();
            if (choice1 == 0) {
                System.out.println("Thanks for playing! Exiting the game.");
                break; // Exit the loop and end the game
            } else if (choice1 < 1 || choice1 > 3) {
                System.out.println("Enter a valid choice (1-3) or 0 to quit.");
                continue; // Skip the rest of the loop and prompt again for valid input
            }

            int choice = rnd.nextInt(3) + 1; // Generate a random choice for the computer (1-3)

            String userChoice = "";
            String computerChoice = "";

            switch (choice1) {
                case 1:
                    userChoice = "Rock";
                    break;
                case 2:
                    userChoice = "Paper";
                    break;
                case 3:
                    userChoice = "Scissors";
                    break;
            }

            switch (choice) {
                case 1:
                    computerChoice = "Rock";
                    break;
                case 2:
                    computerChoice = "Paper";
                    break;
                case 3:
                    computerChoice = "Scissors";
                    break;
            }

            System.out.println("You Picked " + userChoice);
            System.out.println("I Picked " + computerChoice);

            // Determine the winner
            if (choice1 == choice) {
                System.out.println("It's a tie!");
            } else if ((choice1 == 1 && choice == 3) || (choice1 == 2 && choice == 1) || (choice1 == 3 && choice == 2)) {
                System.out.println("You win!");
            } else {
                System.out.println("I win!");
            }
        }
    }
}
