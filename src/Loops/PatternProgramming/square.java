package Loops.PatternProgramming;

public class square {
    public static void main(String[] args) {
        int n = 15;
        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= n; column++) {
                System.out.print("* ");
            }
                System.out.println();
        }

    }
}
