import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static int playRound(int range, int maxAttempts) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(range) + 1;
        int attempts = 0;
        int guess = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("I'm thinking of a number between 1 and " + range + ". Can you guess it?");
        
        while (attempts < maxAttempts) {
            attempts++;
            System.out.print("Attempt " + attempts + ": Enter your guess: ");
            guess = scanner.nextInt();
            
            if (guess == numberToGuess) {
                System.out.println("Congratulations! You guessed the correct number.");
                return attempts;
            } else if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }
        
        System.out.println("Sorry! You've used all your attempts. The correct number was " + numberToGuess + ".");
        return maxAttempts + 1; 
    }
    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        int range = 100; 
        int maxAttempts = 7;
        int score = 0;
        int roundsWon = 0;
        String playAgain;
        
        do {
            int attempts = playRound(range, maxAttempts);
            if (attempts <= maxAttempts) {
                score += maxAttempts - attempts + 1;  
                roundsWon++;
            }
            
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next();
        } while (playAgain.equalsIgnoreCase("yes"));
        System.out.println("Game over!");
        System.out.println("Rounds won: " + roundsWon);
        System.out.println("Final score: " + score);
    }
    
    public static void main(String[] args) {
        System.out.println("Welcome to the Number Guessing Game!");
        playGame();
    }
}