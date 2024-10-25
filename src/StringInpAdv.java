import java.util.Scanner;

public class StringInpAdv {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        scan.nextLine();        // This will solve the problem, this will clean the buffer.
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Hello " + name + ", you are " + age + " years old.");
    }
}
