package Loops.whileLoops.Questions;
import java.lang.*;

public class perfectSquareChecker {
    public static void main(String[] args) {
        int n = 82;
        int squareRoot = (int) Math.sqrt(n);

        System.out.println(squareRoot * squareRoot == n ? "Yes" : "No");
    }
}
