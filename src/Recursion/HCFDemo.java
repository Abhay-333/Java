package Recursion;

public class HCFDemo {
    public static void main(String[] args) {
        int a = 14, b =28;
        int ans = Math.min(a,b);

        for (int i = ans; i > 1 ; i--) {
            if(a % i == 0 && b % i == 0){
                System.out.println(i);
                break;
            }
        }
    }
}
