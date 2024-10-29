package ControlFlowQuestions;
import java.util.Scanner;

public class ValidVoter {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);


        if(!sc.hasNextInt()){
            System.out.println("Please Enter a valid Integer for age.");
            return;
        }

        /* write your code here */
        int age = sc.nextInt();
        sc.nextLine();
        String userName = sc.nextLine();


        if(userName.trim().isEmpty()){
            System.out.println("Please Enter a valid userName. It cant contain spaces or blank");
            return;
        }else if(userName.matches("\\d+")) {
            System.out.println("Please Enter a valid age. It cannot contain numbers.");
            return;
        }

        if(age <= 0 || age > 150){
            System.out.println("Please Enter a valid age");
        }else if(age >=18){
            System.out.println(userName + " is a valid voter.");
        }else{
            System.out.println(userName + " is not a valid voter.");
            System.out.println(userName + " will be eligible in " + (18-age) + " years.");
        }

    }
}