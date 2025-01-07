package Arrays.Questions;

import java.util.Arrays;
import java.util.Scanner;

public class buildArray {
    public static void main(String[] args) {

//        The array ans for [0, 1, 2, 4, 5, 3]is formed as follows:
//
//        ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
//        ans = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
//
//        ans = [0, 1, 2, 4, 5, 3]

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        buildArray obj = new buildArray();
        obj.arrayBuilding(arr, arr.length);

    }

    public int[] arrayBuilding(int arr[], int size) {
        int ans[] = new int[size];

//        arr = [0, 2, 1, 5, 3, 4]
        for (int i = 0; i < ans.length; i++) {
            ans[i] = arr[arr[i]];
        }

        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
