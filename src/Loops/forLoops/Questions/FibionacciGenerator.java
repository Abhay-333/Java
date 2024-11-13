package Loops.forLoops.Questions;

import java.util.Scanner;

public class FibionacciGenerator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 0 1 1 2
        // 0+1 - default numbers
        // 0+1 = 1
        // 1+1 = 2
        // 1+2 = 3
        // 2+3 = 5
        // 3+5 = 8

        int n = sc.nextInt();
        long a = 0, b = 1;


        System.out.println(a);
        System.out.println(b);

        for(int i = 2; i < n; i++){        // Start the loop from 2 because we have cover the default numbers
            long next = a + b;       // to store the sum of current 2 numbers and that will be our next number
            System.out.println(next);
            a = b;      // to change the value of a or to increment a
            b = next;   // to change the value of b or to increment b
        }



    }
}
