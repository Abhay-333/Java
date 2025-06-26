package College;

public class ReverseNumber {
    public static void main(String[] args) { // this is a command line program so u should pass arguments here else
        // the program wont work
        int n = Integer.parseInt(args[0]); // change the value of n here for example n = 123 output: 321
        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n =n/ 10;
        }
        System.out.println("Reversed Number: " + rev);
    }
}