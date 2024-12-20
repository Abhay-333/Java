package Loops.DoWhile;

import java.util.Scanner;

public class GuessTheN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, randomNumber = 0, attempts = 5;
        randomNumber = (int) (Math.random() * 100) + 1;

        System.out.println("Guess the Number Generated by AI");
        System.out.println("Hint: The number is between 1-100");
        System.out.println(randomNumber);

        do {
            if (attempts == 0) {
                System.out.println("Game Over!!! The number was " + randomNumber);
                break;
            }

            System.out.println("You have " + attempts + " Attempts");
            n = sc.nextInt();

            if (n > randomNumber) {
                System.out.println("Your Guessed number is too large");
            } else if(n < randomNumber){
                System.out.println("Your Guessed number is too small");
            }else {
                System.out.println("You Won!!! Congratulations. You Guessed the number in " + attempts + " Attempts.");
            }
            attempts--;
        } while (n != randomNumber);

    }
}
