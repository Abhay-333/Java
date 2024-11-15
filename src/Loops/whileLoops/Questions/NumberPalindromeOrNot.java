package Loops.whileLoops.Questions;

public class NumberPalindromeOrNot {
    public static void main(String[] args) {
        int n = 12321;
        int reversedN = 0;
        int copyOfn = n;

        while (copyOfn != 0) {
            int lastDigit = copyOfn % 10;
            copyOfn = copyOfn / 10;
            reversedN = reversedN * 10 + lastDigit;
        }
         // here the value of n is getting 0 because of code at line 11 so we have to create a
        // copy of variable n that holds n

        System.out.print(n == reversedN ? "Palindromic number" : "No Palindromic number");


    }
}
