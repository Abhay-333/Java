package Math;

public class optimizedPrimeNumberFinder {
    public static boolean prime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i*i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 11;
        for (int i = 1; i <= n; i++) {
            if(prime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println(prime(n));
    }
}
