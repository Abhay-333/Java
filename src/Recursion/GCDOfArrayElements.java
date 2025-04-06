package Recursion;

import java.util.Arrays;

public class GCDOfArrayElements {

    public static int GCD(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int min = nums[0], max = nums[nums.length-1];

        while(max != 0){
            int temp = max;
            max = min % max;
            min = temp;
        }
        if(max == 0) return min;
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {12, 15, 21, 30};
        System.out.println(GCD(arr));
    }
}
