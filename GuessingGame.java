import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        // 1. Setup
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        int numberToGuess = rand.nextInt(100) + 1; // Random number 1-100
        int numberOfTries = 0;
        int guess = 0;
        boolean win = false;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100...");

        // 2. Game Loop
        while (!win) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            numberOfTries++;

            // 3. Conditional Logic
            if (guess == numberToGuess) {
                win = true;
            } else if (guess < numberToGuess) {
                System.out.println("Higher! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Lower! Try again.");
            }
        }

        // 4. Result
        System.out.println("Congratulations! You found it in " + numberOfTries + " tries.");
        sc.close();
    }
}