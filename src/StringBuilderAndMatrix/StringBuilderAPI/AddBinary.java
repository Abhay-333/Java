package StringBuilderAndMatrix.StringBuilderAPI;

import java.util.Arrays;

public class AddBinary {
    public static void main(String[] args) {
        String a = "1010", b = "1011";
        StringBuilder str = new StringBuilder();
        int radix = 2;

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;

            System.out.print(sum + " ");
            if (i >= 0) sum += Character.getNumericValue(a.charAt(i));
            if (j >= 0) sum += Character.getNumericValue(b.charAt(j));
            str.append(sum % radix);
            carry = sum / radix;
            i--;
            j--;
        }
        if (carry == 1) str.append(1);
        str.reverse();
        System.out.print(str);

        System.out.println(Arrays.toString(a.toCharArray()));
    }
}