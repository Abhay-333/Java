package BackTracking.Level2;

import java.util.*;

public class Permutations {
    public static int[] swap(int[] arr, int num1, int num2){
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
        return arr;
    }
    public static List<int[]> recursion(int[] arr, int i, List<int[]> ans) {

        if (i == arr.length - 1 || i + 1 == arr.length) {
            ans.add(Arrays.copyOf(arr, arr.length));
            return ans;
        }

        for (int j = i; j < arr.length; j++) {
            swap(arr, i, j);
            recursion(arr, i+1, ans);
            swap(arr, j, i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        List<int[]> result = recursion(arr, 0, new ArrayList<int[]>());

        for (int[] num : result) {
            System.out.println(Arrays.toString(num));
        }

    }
}
