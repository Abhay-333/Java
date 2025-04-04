package Recursion;

public class GCDOfArrayElements {

    public static int GCD(int[] nums) {

        while (nums[nums.length-1] != 0) {
            int temp = nums[nums.length-1];
            nums[nums.length-1] = nums[0] % nums[nums.length-1];
            nums[0] = temp;
        }
        if(nums[0] == 0) return nums[nums.length-1];
        return nums[0];
    }

    public static void main(String[] args) {
        int arr[] = {12, 15, 21, 30};
        System.out.println(GCD(arr));
    }
}
