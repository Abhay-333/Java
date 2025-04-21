package Math;

public class xTothePowerN {
    public static double pow(int x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;

        double ans = pow(x, n / 2);
        if (n % 2 == 0) {
            ans = ans * ans;
        } else {
            ans = ans * ans * x;
        }
        return ans;
    }

    public static void main(String[] args) {
        int x = 2, n = -2;
        boolean isNegative = false;
        if(n < 0){
            isNegative = true;
        }
        double ans = 1;
        if(isNegative){
            ans = 1/pow(x, n);
            n = n * -1;
        }else {
            ans = pow(x,n);
        }

        System.out.println(ans);
    }
}

// the following code uses Bitwise operators to solve same problem

//class Solution {
//    public double myPow(double x, int n) {
//        double ans = 1;
//        if (x == 1) return 1;
//        if (x == -1) return (n % 2 == 0) ? 1 : -1;
//
//        if (n == Integer.MIN_VALUE) {
//            x=(1/x);
//            n=Integer.MAX_VALUE;
//        }
//
//        if(n<0){
//            x = 1/x;
//            n=-n;
//        }
//        while(n>0){
//            if((n&1)!=0){
//                ans = ans * x;
//            }
//            x= x*x;
//            n=n>>1;
//        }
//
//        return ans;
//    }
//}
