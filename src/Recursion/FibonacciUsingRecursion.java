package Recursion;

public class FibonacciUsingRecursion {
    public static int fibo(int n){
        if(n <= 1)return n;

        System.out.print(fibo(n-1) + fibo(n-2) + " ");
        return fibo(n-1) + fibo(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fibo(6));
    }
}
