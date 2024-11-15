package Loops.whileLoops.Questions;

import java.util.Scanner;

public class DigitSeparation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println(n);
        } else {
            while (n != 0) {
                int remainder = n % 10;
                n = n / 10;
                System.out.println(remainder);
            }
        }

    }
}
