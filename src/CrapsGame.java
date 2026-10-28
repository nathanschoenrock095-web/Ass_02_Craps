
import java.util.Random;
import java.util.Scanner;

public class CrapsGame {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        String playAgain = "Y";

        while (playAgain.equalsIgnoreCase("Y")) {

            System.out.println("\nWelcome to the Craps Game!");

            int die1 = rand.nextInt(6) + 1;
            int die2 = rand.nextInt(6) + 1;
            int sum = die1 + die2;

            System.out.println("Die 1: " + die1);
            System.out.println("Die 2: " + die2);
            System.out.println("Sum: " + sum);

            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("Craps! You crapped out and lost!");

            } else if (sum == 7 || sum == 11) {
                System.out.println("Natural! You won!");

            } else {
                int point = sum;
                System.out.println("Your point is now: " + point);

                boolean gameOver = false;

                while (gameOver == false) {

                    die1 = rand.nextInt(6) + 1;
                    die2 = rand.nextInt(6) + 1;
                    sum = die1 + die2;

                    System.out.println("\nDie 1: " + die1);
                    System.out.println("Die 2: " + die2);
                    System.out.println("Sum: " + sum);

                    if (sum == point) {
                        System.out.println("Made point! You won!");
                        gameOver = true;

                    } else if (sum == 7) {
                        System.out.println("Got a seven! You lost!");
                        gameOver = true;

                    } else {
                        System.out.println("Trying for point: " + point);
                    }
                }
            }

            System.out.print("\nWould you like to play again? (Y/N): ");
            playAgain = input.nextLine();

            while (!playAgain.equalsIgnoreCase("Y") &&
                   !playAgain.equalsIgnoreCase("N")) {
                System.out.print("Please enter Y or N: ");
                playAgain = input.nextLine();
            }
        }

        System.out.println("Thanks for playing!");
        input.close();
    }
}
