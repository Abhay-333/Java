package Loops.whileLoops.Questions;

import java.util.Scanner;

public class ISBN_10Validation {
    public static void main(String[] args) {
        String n = "2222222222";
        int sum = 0, positionValue = 10;
//        int n = 1234567890;


        if (n.length() == 10) {
            for (int i = 0; i < 10; i++) {
                int digit = n.charAt(i) - '0';
                sum += digit * positionValue;
                positionValue--;
            }
            if (sum == 0) {
                System.out.println(false);
            } else {
                System.out.println(sum % 11 == 0);
            }
        } else {
            System.out.println(false);
        }

//        while (n >= 1) {
//            int lastDigit = n % 10;
//            n = n / 10;
//            countOfDigits++;
//
//            for (int positionValue = 10; positionValue >= 1; positionValue--) {
//                sum += lastDigit * positionValue;
//                System.out.println(sum);
//            }
//        }
//
//        if (countOfDigits == 10) {
//            System.out.println(sum % 11 == 0);
//        } else {
//            System.out.println(false);
//        }


    }
}
