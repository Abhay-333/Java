package Loops.forLoops.Questions;

import java.util.Scanner;

public class SumOfEvenIndexFibonacci {

    public static void main(String[] args) {
        // First create normal fibonacci series starting from 0 and 1
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 0, b = 1, next = 0, evenIndicesOfFibbo = a + b, sum = 0;

        System.out.println(a);
        System.out.println(b);

        for (int i = 1; i < 2 * n; i++) {
                next = a + b;
                a = b;
                b = next;               // normal fibonacci Series to 2n

            if(i % 2 == 0){             // This condition gives even index of i
                evenIndicesOfFibbo += next;         //this gives even index of Fibonacci Series
                sum += evenIndicesOfFibbo;
            }
        }
                System.out.println(sum += 1);

    }
}
