package Loops.whileLoops.Questions;

public class AbundantnumberChecker {
    public static void main(String[] args) {
        int n = 10, sumOfDivisors = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sumOfDivisors += i;
            }
        }

        System.out.println(sumOfDivisors > n ? "Yes" : "No");

    }
}
