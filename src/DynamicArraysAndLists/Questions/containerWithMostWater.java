package DynamicArraysAndLists.Questions;

public class containerWithMostWater {
    public static int bruterForce(int arr[]) {
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        int start = 0, end = arr.length - 1;
        int area = 0, maxArea = 0;
        while (start <= end) {
            area = Math.min(arr[start], arr[end]) * (end - start);
            if (arr[start] <= arr[end]) {
                start++;
            } else {
                end--;
            }
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int arr[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
//        int arr[] = {1,1};
        System.out.print(bruterForce(arr));
    }
}
