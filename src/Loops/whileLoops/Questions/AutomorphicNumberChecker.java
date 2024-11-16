package Loops.whileLoops.Questions;
import java.lang.*;

public class AutomorphicNumberChecker {
    public static void main(String[] args) {
        int n = 25;
        int copyOfn = n;
        n = n * n;

        double lastDigit = 0.0;
        double countOfDigit = 0.0;


        while (n != 0) {
            countOfDigit++;
            n = n / 10;
        }
            lastDigit = n % Math.pow(10,countOfDigit);

            System.out.println(lastDigit);

    }
}
