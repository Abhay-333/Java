package Loops.forLoops.Questions;

import java.util.Scanner;

public class SumOfEvenIndexFibonacci {

    public static void main(String[] args) {
        // First create normal fibonacci series starting from 0 and 1
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int fibo = 0;
        int a = 0, b = 1;

        int next = 0;

        for (int i = 2; i < n; i++) {
            next = a + b;
            a = b;
            b = next;
            System.out.println(next);
        }

    }
}
