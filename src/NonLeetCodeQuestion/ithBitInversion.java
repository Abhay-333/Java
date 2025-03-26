package NonLeetCodeQuestion;

public class ithBitInversion {
    public static void main(String[] args) {
        int n = 15, i = 0;

        System.out.println(Integer.toBinaryString(n));  // 1100
        System.out.println(n ^ (1 << i));      // 0100 -> 4
        System.out.println(Integer.toBinaryString(n ^ (1 << i)));
    }
}
