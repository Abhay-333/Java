package Loops.whileLoops.Questions;

public class StrongNumberChecker {
    public static void main(String[] args) {

        int n = 145;
        int sumOfAllFactorial = 0;

        while (n != 0) {
        int lastDigit = n % 10;
            n = n / 10;
            System.out.println(lastDigit);

            int factorial = 1;
            for (int i = lastDigit; i > 1; i--) {
                factorial *= i;
            }
                sumOfAllFactorial += factorial;

        }
                System.out.println(sumOfAllFactorial == n ? "Yes" : "No");


    }
}
