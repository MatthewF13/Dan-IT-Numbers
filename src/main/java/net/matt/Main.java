package net.matt;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = rand.nextInt(101);
        int guessedNumber;
        String name;

        System.out.println("Please, tell me your name: ");
        name = scanner.nextLine();
        System.out.println("Let the game begin!");

        while (true) {
            System.out.println("\nTell me your number: ");
            guessedNumber = scanner.nextInt();

            if (guessedNumber > numberToGuess) System.out.println("Your number is too big");
            else if (guessedNumber < numberToGuess) System.out.println("Your number is too small");
            else {
                System.out.printf("You won, %s!", name);

                System.out.println("\nDo you want to continue? (Y/N): ");
                char userAnswer = scanner.next().toLowerCase().charAt(0);
                if (userAnswer == 'n') break;
                numberToGuess = rand.nextInt(101);
                System.out.println("Let the game begin!");
            }
        }
    }
}