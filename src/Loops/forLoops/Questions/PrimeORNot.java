package Loops.forLoops.Questions;

import java.util.Scanner;

public class PrimeORNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factors = 1;       // Initialize to 1 because every number is divisible by 1

        if (n <= 1) {
            System.out.println("Not Prime");
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    factors++;
                }
            }
            System.out.println(factors >= 2 ? "Not Prime" : "Prime");
        }

    }
}
