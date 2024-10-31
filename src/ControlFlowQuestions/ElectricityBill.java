package ControlFlowQuestions;
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* write your code here */

        int units = sc.nextInt();

        if(units >= 0 && units <=100){
            double amount = units * 4.2; // Rs.4.2 per unit
            System.out.println(amount);
        }else if(units >=101 && units <=200){
            // Rs.6 per unit
            double amount = units * 6; // Rs.6 per unit
            System.out.println(amount);

        }else if(units >= 201 && units <= 400){
            // Rs.8 per unit
            double amount = units * 8; // Rs.8 per unit
            System.out.println(amount);

        }else{
            // Rs.13 per unit
            double amount = units * 13; // Rs.13 per unit
            System.out.println(amount);
        }

    }
}
