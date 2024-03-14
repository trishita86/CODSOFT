import java.util.Scanner;
import java.util.Random;

 class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int maxAttempts = 5;
        int rounds = 0;
        int successfulRounds = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        String playAgain;

        do {
            int attempts = 0;
            int numberToGuess = random.nextInt(100) + 1;
            int guess = 0;
            System.out.println("\nI have randomly chosen a number between 1 and 100.");
            System.out.println("Can you guess it within " + maxAttempts + " attempts?");

            while (attempts < maxAttempts && guess != numberToGuess) {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                attempts++;

                if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
                    successfulRounds++;
                }
            }

            if (guess != numberToGuess) {
                System.out.println("You've run out of attempts! The number was: " + numberToGuess);
            }

            rounds++;
            System.out.print("Do you want to play another round? (yes/no): ");
            playAgain = scanner.next();

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("You've played " + rounds + " round(s) and won " + successfulRounds + " of them.");
        System.out.println("Thank you for playing the Number Guessing Game!");

        scanner.close();
    }
}
