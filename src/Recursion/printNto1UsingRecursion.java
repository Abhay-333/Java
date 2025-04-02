package Recursion;

public class printNto1UsingRecursion {
    public static void printreverse(int n){
        if(n == 0)return;
        System.out.print(n + " ");
        printreverse(n-1);
    }

    public static void main(String[] args) {
        printreverse(5);
    }
}
