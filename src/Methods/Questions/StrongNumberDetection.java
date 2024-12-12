package Methods.Questions;

import java.util.Scanner;

public class StrongNumberDetection {

    public boolean isStrongNumber(int n) {
        int sumOfAllFactorial = 0, copyOfn=n;
        while (n >= 1) {
            int factorialOfDigits = 1;
            int lastDigit = n % 10;
            n = n / 10;

            for (int i = lastDigit; i >= 1; i--) {
                factorialOfDigits *= i;
            }
            sumOfAllFactorial += factorialOfDigits;
        }

        if (sumOfAllFactorial == copyOfn) return true;
        else return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            StrongNumberDetection obj = new StrongNumberDetection();
            System.out.println(obj.isStrongNumber(n));
        }

    }

}
