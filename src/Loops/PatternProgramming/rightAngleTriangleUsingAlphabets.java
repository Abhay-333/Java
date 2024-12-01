package Loops.PatternProgramming;

public class rightAngleTriangleUsingAlphabets {
    public static void main(String[] args) {
        int n = 26;

        for (int i = 1; i <= n; i++) {
            char ch = '@';
            for (int j = 1; j <= i; j++) {
                ch++;
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
