package Recursion;

public class print1ToNUsingRecursion {
    public static void printN(int n){
        if(n == 0) return;
        printN(n-1);
        System.out.print(n + " ");
        return;
    }
    public static void main(String[] args) {
        printN(5);
    }
}
