package Recursion;

public class LCM {
    public static int gcd(int a,int b){
        if(b == 0) return a;
        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        int a = 4, b = 5;
        System.out.println(a*b/gcd(a,b));
    }
}
