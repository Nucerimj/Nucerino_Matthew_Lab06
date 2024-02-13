import java.util.Random;
import java.util.Scanner;

public class HighorLow {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int randomNumber = generator.nextInt(10) + 1;
        int userGuess = 0;  // Initialize userGuess
        boolean done = false;

        do {
            System.out.print("Guess the number (1 to 10): ");

            if (in.hasNextInt()) {
                userGuess = in.nextInt();
                in.nextLine();
                done = true;
            } else {
                in.nextLine();
                System.out.println("\nInvalid input! Please enter a valid integer.");
            }
        } while (!done);

        System.out.println("Random number: " + randomNumber);

        if (userGuess == randomNumber) {
            System.out.println("Congratulations! Your guess is correct!");
        } else if (userGuess < randomNumber) {
            System.out.println("Too low! The correct number is higher.");
        } else {
            System.out.println("Too high! The correct number is lower.");
        }
    }
}
