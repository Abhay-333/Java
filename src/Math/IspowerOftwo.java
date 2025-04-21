package Math;

public class IspowerOftwo {
    public static boolean isPower(int n) {
//        double ans = 1;
//        for (int i = 0; i <= n; i++) {
//            ans = pow(2, i);
//            if(ans == n) return true;
//            if(ans > n) return false;
//        }
        if(n == 1) return true;
        if(n % 2 != 0 || n == 0) return false;

        return isPower(n/2);
    }

//    public static double pow(int x, int n) {
//        if (n == 0) return 1;
//        if (n == 1) return x;
//
//        double ans = pow(x, n / 2);
//        if (n % 2 == 0) {
//            ans = ans * ans;
//        } else {
//            ans = ans * ans * x;
//        }
//        return ans;
//    }

    public static void main(String[] args) {
        int n = 11465;
        System.out.println(isPower(n));
    }
}
