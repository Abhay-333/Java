package Recursion;

public class sumOfNUsingRecursion {
    public static int sumOfN(int n){
        if (n == 0) return 0;
        return sumOfN(n-1) + n;
    }
    public static void main(String[] args) {
        System.out.println(sumOfN(5));
    }
}
