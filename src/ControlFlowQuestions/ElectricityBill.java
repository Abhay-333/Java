package ControlFlowQuestions;
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* write your code here */

        int units = sc.nextInt();
        double amount = 0.0;

        if(units >= 0 && units <=100){
            amount = units * 4.2; // Rs.4.2 per unit
        }else if(units >=101 && units <=200){
            // Rs.6 per unit
            amount = 420 + (units - 100) * 6; // Rs.6 per unit

        }else if(units >= 201 && units <= 400){
            // Rs.8 per unit
            amount = 1020 + (units - 200) * 8; // Rs.8 per unit

        }else{
            // Rs.13 per unit
            amount = 2620 + (units - 400) * 13; // Rs.13 per unit
        }
        System.out.printf("%.1f%n",amount);
//        System.out.println(amount);

    }
}
