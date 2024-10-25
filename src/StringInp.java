import javax.sound.midi.SysexMessage;
import java.util.Scanner;
public class StringInp {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = scan.nextLine();
        System.out.println("Enter Your age: ");
        int age = scan.nextInt();
        System.out.println("Hello " + name + ", you are " + age + " years old.");

    }
}
