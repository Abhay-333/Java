package ControlFlowQuestions.SwitchCase;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Choose Which operation you want to perform(Please enter a number to choose)");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            int n = sc.nextInt();

            switch (n) {
                case 1 -> {
                    System.out.println("Enter Two numbers: ");
                    int num1 = sc.nextInt(), num2 = sc.nextInt();
                    System.out.println("Sum = " + (num1 + num2));
                }
                case 2 -> {
                    System.out.println("Enter Two numbers: ");
                    int num1 = sc.nextInt(), num2 = sc.nextInt();
                    System.out.println("Difference = " + (num1 - num2));
                }
                case 3 -> {
                    System.out.println("Enter Two numbers: ");
                    int num1 = sc.nextInt(), num2 = sc.nextInt();
                    System.out.println("Product = " + (num1 * num2));
                }
                case 4 ->{
                    System.out.println("Enter Two numbers: ");
                    int num1 = sc.nextInt(), num2 = sc.nextInt();
                    System.out.println("Division = " + (num1 / num2));
                }
                case 5 ->{

                }
            }
            if(n == 5) break;

        } while (true);


//        String operation = switch (n) {
//            case 1 -> operation = "Addition";
//            case 2 -> operation = "Subtraction";
//            case 3 -> operation = "Multiplication";
//            case 4 -> operation = "Division";
//            case 5 -> operation = "Restart Operation";
//
//            default -> "Wrong Input";
//        };

    }
}
