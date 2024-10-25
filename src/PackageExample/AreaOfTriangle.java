package PackageExample;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a or length of sides of triangle: ");
        double a = sc.nextDouble();
        System.out.println("Enter the value of b or length of sides of triangle: ");
        double b = sc.nextDouble();
        System.out.println("Enter the value of c or length of sides of triangle: ");
        double c = sc.nextDouble();

        double s =  (((a+b)+c)/2);
        System.out.println("The value of s or semi-perimeter of triangle is: " + s);

        System.out.println("The area of triangle is: " + Math.sqrt(s*(s-a)*(s-b)*(s-c)) );


    }
}


