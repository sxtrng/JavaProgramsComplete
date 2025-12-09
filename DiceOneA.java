import java.util.Random;
import java.util.Scanner;

public class DiceOneA {
    public static void main(String[] args) {

        Random randomDiceValue = new Random();
        Scanner scanner = new Scanner(System.in);
        int userInput;
        int userRoll;

        System.out.println("Instructions: Press 1 to roll.  Press -1 to quit.");

        do {
            userRoll = randomDiceValue.nextInt(1, 7);
            System.out.print("Press 1: ");
            userInput = scanner.nextInt();

            if (userInput == 1) {
                System.out.printf("You rolled: %d\n", userRoll);
            }
        } while (userInput != -1);

        System.out.println("Thanks, and I'll see you again.");

        scanner.close();
    }
}