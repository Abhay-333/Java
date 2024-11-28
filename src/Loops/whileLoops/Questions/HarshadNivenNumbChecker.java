package Loops.whileLoops.Questions;

public class HarshadNivenNumbChecker {
    public static void main(String[] args) {
        int n = 18, copyOfN = n, sumOfDigits = 0;

        while(n >= 1){
            int lastDigit = n % 10;
            n = n / 10;
            sumOfDigits += lastDigit;
        }

        System.out.println(copyOfN % sumOfDigits == 0 ? "Yes" : "No");
    }
}
