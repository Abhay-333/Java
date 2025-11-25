package BackTracking.Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets2 {
    public static List<List<Integer>> recursion(int arr[], int i, ArrayList<Integer> currentSet, List<List<Integer>> ans, boolean picked) {
        if (i == arr.length) {
            ans.add(new ArrayList<>(currentSet));
            return ans;
        }

        if (i == 0 || arr[i] != arr[i - 1] || picked) {
            //picked wala code
            currentSet.add(arr[i]);
            recursion(arr, i + 1, currentSet, ans, true);
            currentSet.remove(currentSet.size() - 1);
        }
        //unpicked wala code
        return recursion(arr, i + 1, currentSet, ans, false);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        Arrays.sort(arr);
        System.out.println(recursion(arr, 0, new ArrayList<>(), new ArrayList<List<Integer>>(), true));
    }
}
