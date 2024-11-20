package Loops.whileLoops.Questions;
import java.lang.*;
import java.util.Scanner;

public class AutomorphicNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int copyOfn = n;
        int square = n * n;

        long lastDigit = 0;
        int countOfDigit = 0;


        while (n != 0) {
            countOfDigit++;
            n = n / 10;
        }
            lastDigit = square % (long) Math.pow(10,countOfDigit);   // explicit type conversion or type casting

            System.out.println(lastDigit == copyOfn ? "Yes" : "No");

            // Predict the output questions
//            int x = 2;
//            while(x < 10){
//                System.out.println(x);
//                x--;
//            }

//            int y = 1;
//            while(y){           // will give compilation error : there should a condition at the place of y
//                System.out.println(y);
//                y++;
//            }

    }
}
