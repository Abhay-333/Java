import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers separated by space: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("Sum of: " + a + " & " + b + " is " + (a + b));
    }
}