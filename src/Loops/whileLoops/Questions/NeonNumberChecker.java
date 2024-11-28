package Loops.whileLoops.Questions;

public class NeonNumberChecker {
    public static void main(String[] args) {
        int n = 9, square = n * n, sumOfSquaredValue = 0;

        while(square >= 1){
            int lastDigit = square % 10;
            square = square / 10;
            sumOfSquaredValue += lastDigit;
        }
            System.out.println(sumOfSquaredValue == n ? "Yes" : "No");

    }
}
