package BackTracking.Level2.Level1;

public class TowerOfHanoi {
    public static int towerOfHanoi(int n, int src, int h, int dest) {
        // Time complexity: O(2^n-1) -> O(2^n)
        if (n == 1) {
            System.out.println(src + " -> " + dest);
            return n;
        }

        towerOfHanoi(n - 1, src, dest, h);
        System.out.println(src + " -> " + dest);

        towerOfHanoi(n - 1, h, src, dest);

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(towerOfHanoi(3, 1, 2, 3));
    }

}
