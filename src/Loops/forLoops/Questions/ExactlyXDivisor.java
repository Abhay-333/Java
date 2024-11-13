package Loops.forLoops.Questions;

import java.util.Scanner;

public class ExactlyXDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

/*
        Find Number of Integers with Exactly X Divisors
        Given an integer n, your task is to find how many integers from 1 to n have exactly x divisors.
        An integer is said to have exactly x divisors if the total count of numbers that divide it evenly is equal to x.

  */

        int n = sc.nextInt();
        int x = sc.nextInt();
        int countOfExactDivisors = 0;

        for(int i = 1; i <= n; i++){

            int divisorsCount = 0;

            for(int j = 1; j<=i; j++){
                if(i%j == 0){
                    divisorsCount++;
                }
            }

            if(divisorsCount == x){
                countOfExactDivisors++;
            }

        }

        System.out.println(countOfExactDivisors);
    }
}
