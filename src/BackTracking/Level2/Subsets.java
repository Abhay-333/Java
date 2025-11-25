package BackTracking.Level2;

import java.util.*;

public class Subsets {
    public static List<List<Integer>> recursion(int arr[], int i, ArrayList<Integer> currentSet, List<List<Integer>> ans) {
        // TC = O(2n*n)
        // SC = O(2n*n)
        if(i == arr.length){
//            ans.add(currentSet);
            if(currentSet.size() == 0){
                ans.add(new ArrayList<>());
            }
            return ans;
        }
        //first try to choose and call the function
        currentSet.add(arr[i]);
        ans.add(new ArrayList<>(currentSet));
        recursion(arr, i+1, currentSet, ans);
        //Second store it in ans as new ArrayList
        System.out.println(currentSet);
        currentSet.remove(currentSet.size()-1);
        //Third give call for not picking that element
        return recursion(arr, i+1, currentSet, ans);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        List<List<Integer>> ans = new ArrayList<>();
//        Collections.sort(ans);

        System.out.println((recursion(nums, 0, new ArrayList<>(), ans)));
    }
}