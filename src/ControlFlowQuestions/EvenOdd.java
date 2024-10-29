package ControlFlowQuestions;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        if(a%2 ==0){
            System.out.println("The given number is Even");
        }else{
            System.out.println("The given number is Odd");
        }

        int x = 11, y=22;
        if(x++ == 11 || ++y ==23 ){         // Predict the output
            System.out.println(x + "" + y);
        }else {
            System.out.println(x + "" + y);
        }

        int c = 50;
        if(c <= 50){
            System.out.println("asd");
        }else{
            System.out.println("xyz");
        }

    }
}
