package NonLeetCodeQuestion;

public class ithBitsetOrNot {
    public static void main(String[] args) {
        int n = 12, i = 3;
        System.out.println(Integer.toBinaryString(n));
        System.out.println((n & (1 << i)) == 0 ? "not set" : "set");    //This means left shift the number 1 by i positions.
    }
}

