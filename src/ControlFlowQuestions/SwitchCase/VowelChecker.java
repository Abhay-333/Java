package ControlFlowQuestions.SwitchCase;

import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

            switch (ch) {
                case 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U': {
                    System.out.println("Vowel");
                    break;
                }
                default:
                    System.out.println("Consonant");
            }

        } else {
            System.out.println("Not a letter");
        }

    }
}
