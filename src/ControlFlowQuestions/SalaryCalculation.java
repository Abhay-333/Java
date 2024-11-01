package ControlFlowQuestions;
import java.util.Scanner;

public class SalaryCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char gender = sc.nextLine().charAt(0);
        int yos = sc.nextInt();
        sc.nextLine();
        char qual = sc.nextLine().charAt(0);

        if(gender == 'm' || gender == 'M'){
            if(yos >= 10 && (qual == 'P' || qual == 'p') ){
                System.out.println(15000);
            }else if(yos >= 10 && (qual == 'U' || qual == 'u') ){
                System.out.println(10000);
            }else if(yos < 10 && (qual == 'P' || qual == 'p') ){
                System.out.println(10000);
            }else{
                System.out.println(7000);
            }

        }else{
            if(yos >= 10 && (qual == 'P' || qual == 'p')){
                System.out.println(12000);
            }else if( yos >= 10 && (qual == 'U' || qual == 'u') ){
                System.out.println(9000);
            }else if(yos < 10 && (qual == 'P' || qual == 'p') ){
                System.out.println(10000);
            }else{
                System.out.println(6000);
            }

        }
    }
}