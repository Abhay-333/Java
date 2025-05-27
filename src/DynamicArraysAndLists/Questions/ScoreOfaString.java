package DynamicArraysAndLists.Questions;

public class ScoreOfaString {
    public static int bruteForce(String str) {
        char[] strArr = str.toCharArray();
        int difference = 0;
        for (int i = 0; i < str.toCharArray().length - 1; i++) {
            int currentElementCode = str.toCharArray()[i], nextElementCode = str.toCharArray()[i + 1];
            difference += Math.abs(currentElementCode - nextElementCode);

            System.out.print(difference + " ");
        }

        return 0;
    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(bruteForce(s));

    }
}
