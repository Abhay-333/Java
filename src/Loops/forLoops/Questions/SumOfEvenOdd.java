package Loops.forLoops.Questions;

import java.util.Scanner;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        int sumOfEven = 0;
        int sumOfOdd = 0;

        if(start > end){
            start = start + end;
            end = start - end;
            start = start - end;
        }

        for(int i = start; i <= end; i++){
            if(i % 2 == 0){
                sumOfEven+=i;
            }else {
                sumOfOdd+=i;
            }
        }

        System.out.println(sumOfEven);
        System.out.println(sumOfOdd);

    }
}
