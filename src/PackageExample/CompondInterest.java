package PackageExample;

import java.util.Scanner;

public class CompondInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principal amount: ");
        double principal = sc.nextDouble();

        System.out.println("Enter time Period: ");
        double time = sc.nextDouble();

        System.out.println("Enter Rate: ");
        double rate = sc.nextDouble() / 100;

        double compoundInterest = (principal * Math.pow((1 + rate),time)) - principal ;
        System.out.println("Compound Interest = " + compoundInterest);
    }
}
