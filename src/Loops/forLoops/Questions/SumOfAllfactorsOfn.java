package Loops.forLoops.Questions;

import java.util.Scanner;

public class SumOfAllfactorsOfn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumOfFactors = 1;   // 1 is the common factor in all the numbers

        for(int i = 2; i < n; i++){     // that's why we are starting our loop from 2
            if(n % i == 0){
                sumOfFactors += i;
            }
        }
        System.out.println(sumOfFactors);
    }
}
