package ControlFlowQuestions;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();

        if(a>b){
            System.out.println("a is Greater than b.");
        }else if(a == b){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("b is Greater than a.");
        }

    }
}
