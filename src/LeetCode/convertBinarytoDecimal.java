package LeetCode;

public class convertBinarytoDecimal {
    public static void main(String[] args) {
        String binaryStr = "1010";
        int result = 0, i = 1;

        // Solution 1 : fails 1 test case
//        int n = Integer.parseInt(binaryStr, 2), result = 0, i = 0, sum = 0;
//
//        while (n != 0) {
//            int lastDigit = n % 10;
//            result = lastDigit * (int) Math.pow(2, i++);
//            sum += result;
//            n = n / 10;
//        }
//        String decimal = "" + sum;
//        System.out.println(decimal);

        // Solution 2:
        while (i <= binaryStr.length()) {
            if (binaryStr.charAt(i - 1) == '1') {
                result += (int) Math.pow(2, binaryStr.length() - i);
            }
            i++;
        }
        System.out.println(result);
    }
}
