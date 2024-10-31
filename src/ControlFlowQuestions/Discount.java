package ControlFlowQuestions;
import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* write your code here */

        int initialAmount = sc.nextInt();

        if( initialAmount > 5000 && initialAmount <= 7000){
            // 5%
            double discount = (5/100.0) * initialAmount;
            double finalAmount = initialAmount - discount;
            System.out.printf("%.0f%n",finalAmount);
        }else if(initialAmount > 7000 && initialAmount <= 9000){
            //10%
            double discount = (10/100.0) * initialAmount;
            double finalAmount = initialAmount - discount;
            System.out.printf("%.0f%n",finalAmount);
        }else if(initialAmount > 9000){
            //20%
            double discount= (20/100.0) * initialAmount;
            double finalAmount = initialAmount - discount;
            System.out.printf("%.0f%n",finalAmount);
        }else{
            // 0%
            int discount = 0;
            int finalAmount = initialAmount - discount;
            System.out.println(finalAmount);
        }

    }
}
