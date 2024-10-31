package ControlFlowQuestions;

import java.util.Scanner;

public class VolwelChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // this method is good but the problem is teacher did'nt tought us regex, if they did'nt thought regex then,
        // i must solve this question without using regex. Therefore using normal method

        char ch = sc.next().charAt(0);

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <='Z')){
            if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                System.out.println("Vowel");
            }else{
                System.out.println("Consonant");
            }
        }else{
            System.out.println("Invalid Input");
        }

        //        String ch = sc.next().trim();

//        if(ch.equals(" ")){
//            System.out.println("Invalid Input space");
//        }else{
//            if(String.valueOf(ch.charAt(0)).matches("[A-Za-z]")){
//                if(String.valueOf(ch.charAt(0)).equalsIgnoreCase("a") || String.valueOf(ch.charAt(0)).equalsIgnoreCase("e") || String.valueOf(ch.charAt(0)).equalsIgnoreCase(
//                        "i") || String.valueOf(ch.charAt(0)).equalsIgnoreCase("o") || String.valueOf(ch.charAt(0)).equalsIgnoreCase("u")){
//                System.out.println("Vowel");
//                }else{
//                    System.out.println("Consonant");
//                }
//            }else{
//                System.out.println("Invalid Input");
//
//            }
//
//        }

    }
}
