package LeetCode;

import java.util.Arrays;

public class CompareVersionsNumbers {
    public static void main(String[] args) {
        String version1 = "1.2", version2 = "1.10";
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        System.out.println(compareV1andV2(v1, v2));

    }

    public static int compareV1andV2(String[] v1, String[] v2) {
        int length = Math.max(v1.length, v2.length);

        for (int i = 0; i < length; i++) {
            int num1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
            int num2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;

            if (num1 < num2) return -1;
            if (num1 > num2) return 1;
        }
        return 0;
    }
}
