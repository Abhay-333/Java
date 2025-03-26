package NonLeetCodeQuestion;

public class swapWithoutUsingThirdVariable {
    public static void main(String[] args) {
        int a = 10, b = 5;

// Using arthmetic operators
        a = a +b;
        b = a - b;
        a = a - b;


// Using bitwise operators
//        a = a ^ b;
//        b = a ^ b;
//        a = a ^ b;

        System.out.println(a);
        System.out.println(b);
    }
}
