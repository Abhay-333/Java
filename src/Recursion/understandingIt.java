package Recursion;

public class understandingIt {
    public static int sum(int n) {
        if (n == 1) return 1;        // when this condition gets true then our backtracking gets started
        return n + sum(n - 1);
    }


    public static void printHello(int n) {
        if(n == 0) return;
        System.out.println("Hello World");
        printHello(n-1);
    }

    public static void main(String[] args) {
//        System.out.println(sum(5));
        printHello(4);
    }
}
