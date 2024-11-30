package Loops.DoWhile;

import java.util.Scanner;

public class RepeatHello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do{
            System.out.println("Hello");
            System.out.println("Press 1 to repeat");
            n = sc.nextInt();
        }while(n == 1);

    }
}
