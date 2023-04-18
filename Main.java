import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
//        System.out.println("Random number is " + randomNumber);

        int tryCount = 0;
        while(true) {
            System.out.println("Enter your guess (1-100):");

            int playerGuess = scan.nextInt();
            tryCount++;

            if (playerGuess == randomNumber) {
                System.out.println("You guessed right! You win!");
                System.out.println("You needed " + tryCount + " tries to finish the game!");
                break;
            } else if (randomNumber > playerGuess) {
                System.out.println("Nope! The number is higher! Guess again!");
            } else {
                System.out.println("Nope! The number is lower! Guess again!");
            }
        }
    }
}