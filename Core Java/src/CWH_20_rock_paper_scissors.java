//import java.util.Scanner;
//import java.util.Random;
//
//public class CWH_20_rock_paper_scissors{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Random rand = new Random();
//
//        String[] choices = {"rock", "paper", "scissors"};
//        System.out.println("Welcome to Rock, Paper, Scissors");
//
//        while(true){
//            System.out.println("Enter your Choices : ");
//            String playerchoice = sc.nextLine().toLowerCase();
//
//            if(!playerchoice.equals("rock") && !playerchoice.equals("paper") && !playerchoice.equals("scissors")){
//                System.out.println("Invalid Choice Please try again.");
//                continue;
//            }
//
//            int randomIndex = rand.nextInt(3);
//            String computerChoice = choices[randomIndex];
//
//            System.out.println("Computer's choice: " + computerChoice);
//
//            if (playerchoice == (computerChoice)) {
//                System.out.println("It's a tie!");
//            }
//            else if ((playerchoice.equals("rock") && computerChoice.equals("scissors")) ||
//                    (playerchoice.equals("paper") && computerChoice.equals("rock")) ||
//                    (playerchoice.equals("scissors") && computerChoice.equals("paper"))) {
//                System.out.println("You win!");
//            }
//            else {
//                System.out.println("Computer wins!");
//            }
//
//            System.out.print("Do you want to play again? (yes/no): ");
//            String playAgain = sc.nextLine().toLowerCase();
//
//            if (!playAgain.equals("yes")) {
//                System.out.println("Thank you for playing. Goodbye!");
//                break;
//            }
//        }
//
//        sc.close();
//
//        }
//    }


import java.util.Scanner;
import java.util.Random;

public class CWH_20_rock_paper_scissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = { "rock", "paper", "scissors" };

        System.out.println("Welcome to Rock-Paper-Scissors game!");

        while (true) {
            System.out.print("Enter your choice (rock, paper, or scissors): ");
            String playerChoice = scanner.nextLine().toLowerCase();

            // Check if the player's choice is valid
            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            // Generate a random choice for the computer
            int randomIndex = random.nextInt(3);
            String computerChoice = choices[randomIndex];

            System.out.println("Computer's choice: " + computerChoice);

            // Determine the winner
            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.nextLine().toLowerCase();

            if (!playAgain.equals("yes")) {
                System.out.println("Thank you for playing. Goodbye!");
                break;
            }
        }

        scanner.close();
    }
}