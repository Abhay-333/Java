package Loops.forLoops.Questions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long factorial = 1L;

        if(n == 0){
            System.out.println(factorial);
        }else{
            for(int i = n; i >= 1; i--){
                factorial *= i;
            }
            System.out.println(factorial);
        }

    }
}
