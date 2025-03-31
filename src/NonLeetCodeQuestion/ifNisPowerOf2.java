package NonLeetCodeQuestion;

public class ifNisPowerOf2 {
    public static void main(String[] args) {
        // this technique wont work  for negative numbers
        int n = 8;

        System.out.println((n & (n-1)) == 0 ? "Yes" : "No");
    }
}
