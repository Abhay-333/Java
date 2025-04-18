package Math;

public class sqrtOfN {
    public static void main(String[] args) {
        int n = 64;
        // this code fails huge inputs
        // Leetcode question 69
        for (int i = 1; i*i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}
