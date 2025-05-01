package DynamicArraysAndLists.Questions;

import java.util.Arrays;

public class mergeTwoSortedArray {

    public static int[] optimisedCode2(int arr1[], int arr2[], int m, int n) {
        // Time complexity: O(m+n)
        // Space complexity: O(1)
        int i = m - 1, j = n - 1, k = arr1.length - 1;
        try {
            while (i >= 0 && j >= 0) {
                if (arr1[i] >= arr2[j]) {
                    arr1[k--] = arr1[i--];
                } else {
                    arr1[k--] = arr2[j--];
                }
            }
            while (j >= 0) {
                arr1[k--] = arr2[j--];
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return arr1;
    }

    public static int[] optimisedCode1(int arr1[], int arr2[]) {
        // Time complexity: O(m+n)
        // Space complexity: O(m+n)
        int ans[] = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;
        try {
            while (k < ans.length) {
                if (i == arr1.length) {
                    ans[k++] = arr2[j++];
                    continue;
                } else if (j == arr2.length) {
                    ans[k++] = arr1[i++];
                    continue;
                }

                if (arr1[i] <= arr2[j]) {
                    ans[k++] = arr1[i++];
                } else {
                    ans[k++] = arr2[j++];
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return ans;
    }

    public static int[] bruteForce(int arr1[], int arr2[]) {
        // Time complexity: O(m+n (log (m+n)))
        // Space complexity: O(m+n)
        int ans[] = new int[arr1.length + arr2.length];

        for (int i = 0, j = 0, k = 0; i < ans.length; i++) {
            try {
                if (i < arr1.length) {
                    ans[i] = arr1[i];
                } else {
                    ans[i] = arr2[j++];
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        Arrays.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        int arr1[] = {2, 3, 7, 9, 0, 0, 0, 0, 0, 0, 0, 0};
        int arr2[] = {1, 5, 7, 8, 10, 14, 16, 17};
        int m = 4, n = 8;

//        System.out.println(Arrays.toString(bruteForce(arr1, arr2)));
//        System.out.println(Arrays.toString(optimisedCode1(arr1, arr2)));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(optimisedCode2(arr1, arr2, m, n)));
    }
}
