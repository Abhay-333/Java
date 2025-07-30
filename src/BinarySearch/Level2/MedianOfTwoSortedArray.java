package BinarySearch.Level2;

public class MedianOfTwoSortedArray {

    public static double calculateMedian(int arr1[], int arr2[], int m, int n) {
        if (arr1.length > arr2.length) {
            int temp[] = arr1;
            arr1 = arr2;
            arr2 = temp;
        }

        int start = 0, end = m;

        while (start <= end) {
            int mid1 = (start + end) / 2;
            int mid2 = ((m + n + 1) / 2) - mid1;

            int l1 = (mid1 == 0) ? Integer.MIN_VALUE : arr1[mid1 - 1];
            int r1 = (mid1 == m) ? Integer.MAX_VALUE : arr1[mid1];

            int l2 = (mid2 == 0) ? Integer.MIN_VALUE : arr2[mid2 - 1];
            int r2 = (mid2 == n) ? Integer.MAX_VALUE : arr2[mid2];

            if (l1 <= r2 && l2 <= r1) {
                if ((m + n) % 2 == 0) {
                    // when size is even
                    return ((Math.max(l1, l2) + Math.min(r1, r2)) / 2.0);
                } else {
                    // when size is odd
                    return Math.max(l1, l2);
                }
            }

            if (l2 > r1) {
                start = mid1 + 1;
            } else {
                end = mid1 - 1;
            }
        }
        return 0.0;
    }

    public static void main(String[] args) {
        int arr1[] = {1};
        int arr2[] = {1};
//        int arr1[] = {1, 3, 9, 11, 15};
//        int arr2[] = {2, 4, 7, 20, 29, 45, 58};
//        int arr2[] = {2, 4, 7, 20, 29, 45};
//        int arr1[] = {1, 3, 5, 7};
//        int arr2[] = {2, 4, 6, 8};
        System.out.println(calculateMedian(arr1, arr2, arr1.length, arr2.length));
    }
}
