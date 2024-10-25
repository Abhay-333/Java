import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello World !!");
        byte a = 14;
        int b = 13;
        float c = 523.23f;
        long d = 292305023L;
        double e = 292305023L;
        int f = 2;
        System.out.println("sum = " + (b+f));
        // Java is case sensative
        int g, G; // both are different variables

        Scanner scans = new Scanner(System.in);
        System.out.println("Please Enter a value: ");
        int input1 = scans.nextInt();
        System.out.println("Please Enter another value: ");
        int input2 = scans.nextInt();
        System.out.println("Sum = " + (input1 + input2));

        System.out.println("Enter your Name: ");
        String input3 = scans.next();
        String str1 = scans.nextLine();
        System.out.println("The user input is = " + input3);
        System.out.println("str1 = " + str1);

        System.out.println("Enter a string: ");
        char ch = scans.nextLine().charAt(0);
        System.out.println(ch);

        System.out.println("Enter userName: ");
        String userName = scans.next();
        System.out.println("Enter your age: ");
        int age = scans.nextInt();

        System.out.println("WelCome! " + userName + " You are " + age + " years old.");

        if(scans.hasNext()){
            System.out.println("Next Token: " + scans.hasNext());
        }else {
            System.out.println("Invalid Input.");
        }
    }
}
