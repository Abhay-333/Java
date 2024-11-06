package Loops.forLoops.Questions;

import java.util.Scanner;

public class PowerOfNUsingLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == 0){
            System.out.println("Undefined");
        }
        else if (b == 0) {
            int result = 1;
            System.out.println(result);
        } else if (b < 0) {
                double result = 1.0;
            for (int i = -1; i >= b; i--) {         //for negative power calculation
                result *=  a;
            }
                System.out.println(1/result);
        } else {
            int result = 1;
            for (int i = 1; i <= b; i++) {         //for the power calculation
                result *= a;
            }
            System.out.println(result);
        }


    }
}
