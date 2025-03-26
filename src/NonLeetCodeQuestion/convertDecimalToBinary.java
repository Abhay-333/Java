package NonLeetCodeQuestion;

public class convertDecimalToBinary {
    public static void main(String[] args) {

        int n = 10;
        StringBuilder binaryCode = new StringBuilder();

        while (n != 0) {
            binaryCode.append(n % 2);
            n = n / 2;
        }

        System.out.println(binaryCode.reverse().toString());
    }
}
