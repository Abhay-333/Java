package Loops.whileLoops.Questions;

import java.util.Scanner;

public class ReverseOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int remainder = n % 10;

        if (remainder != 0) {       // when remainder is not equal to zero that means when remainder = 1 to 9 but not
            // zero
            while (n != 0) {
                int lastDigit = n % 10;
                n = n / 10;
                System.out.print(lastDigit);
            }
        } else {        // when remainder = 0

            while (n != 0) {
                int forTheZeros = 0;
                int lastDigit = n % 10;
                n = n / 10;

                if (lastDigit == 0) {
                    forTheZeros += lastDigit;
                }else{
                    System.out.print(lastDigit);
                }

            }

        }


    }
}
