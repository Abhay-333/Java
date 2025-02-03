package StringsInDepth;

public class reverseString {
    public static void main(String[] args) {
        String s1 = "hello", rev = "";

// here we are just displaying the reverse string we are not creating one
//        for (int i = s1.length() -1; i >= 0; i--) {
//            System.out.println(s1.charAt(i));
//        }

        // this is use to create a new reverse string

        for (int i = s1.length() - 1; i >= 0; i--) {
            rev = rev + s1.charAt(i);
        }
//        System.out.println(rev);


        // Predict the output questions
//        String letters = "";
//        while(letters.length() != 2)
//        letters += "a";
//        System.out.println(letters);

        // q2

        String s2 = "Hello";
        s2.concat("World");
//        System.out.println(s2); // o/p = Hello, because we did'nt store the s2.concate code in another variable

        String s3 = "Java Programming";
//        System.out.println(s3.substring(5,8)); // output: Pro
        // count the space also
        // s3.substring(5,8) returns the substring starting at index 5 up to, but not including, index 8, which is "Pro"

        String s4 = "hello";
        System.out.println(s4.substring(0,5));
        System.out.println(s4.substring(5));
    }
}
