package Loops.PatternProgramming;

public class BoatShape {
    public static void main(String[] args) {
        int triangle = 5, trapezoid = 5, water;

        for (int i = 1; i <= triangle; i++) {

            for (int k = 1; k <= triangle + 3; k++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i = 1; i <= trapezoid; i++) {
            for (int j = 1; j <= 4 * trapezoid; j++) {
                if (i == 1 || i == j || i + j == 21 || i == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

//        for (int i = 1; i <= trapezoid * 4; i++) {
//            for (int j = 1; j <= trapezoid * 4 - i; j++) {
//                if (j == i || i == 1) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

    }
}
