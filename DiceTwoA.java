import java.util.Random;
import java.util.Scanner;

public class DiceTwoA {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberOfDice;
        int sumOfDice = 0;

        System.out.print("Enter Number of Dice to Roll: ");
        numberOfDice = scanner.nextInt();

        System.out.println("********************************");
        System.out.println("\n");

        if (numberOfDice > 0) {
            for (int i = 0; i < numberOfDice; i++) {
                int roll = random.nextInt(1, 7);
                System.out.printf("\t%d\n", roll);
                printRoll(roll);
                sumOfDice += roll;
            }
            System.out.println("Total Value of Rolled Dice: " + sumOfDice);
            System.out.println("**************************************************");
        } else {
            System.out.println("Must be greater than zero.");
        }

        scanner.close();

    }

    static void printRoll(int roll) {
        String diceOne = """
                          -------
                         |       |
                         |   º   |
                         |       |
                          -------
     
                         """;

        String diceTwo = """
                          -------
                         |  º    |
                         |       |
                         |    º  |
                          -------
     
                         """;


        String diceThree = """
                          -------
                         |  º    |
                         |   º   |
                         |    º  |
                          -------
     
                         """;


        String diceFour = """
                          ------
                         | º  º |
                         |      |
                         | º  º |
                          ------
     
                         """;


        String diceFive = """
                          ------
                         | º  º |
                         |   º  |
                         | º  º |
                          ------
     
                         """;


        String diceSix = """
                          ------
                         | º  º |
                         | º  º |
                         | º  º |
                          ------
     
                         """;


        switch (roll) {
            case 1 -> System.out.print(diceOne);
            case 2 -> System.out.print(diceTwo);
            case 3 -> System.out.print(diceThree);
            case 4 -> System.out.print(diceFour);
            case 5 -> System.out.print(diceFive);
            case 6 -> System.out.print(diceSix);
            default -> System.out.println("INVALID");

        }
    }
}