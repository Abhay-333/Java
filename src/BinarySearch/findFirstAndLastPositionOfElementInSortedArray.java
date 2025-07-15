package BinarySearch;

public class findFirstAndLastPositionOfElementInSortedArray {
    public static int firstOccurence(int arr[], int start, int end, int target) {
        if (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                int leftSearch = firstOccurence(arr, start, mid - 1, target);
                return (leftSearch != -1) ? leftSearch : mid;
            } else if (arr[mid] < target) {
                return firstOccurence(arr, mid + 1, end, target);
            } else if (arr[mid] > target) {
                return firstOccurence(arr, start, mid - 1, target);
            }
        }
        return -1;
    }

    public static int lastOccurrence(int arr[], int start, int end, int target) {
        if (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                int rightSearch = lastOccurrence(arr, mid + 1, end, target);
                return (rightSearch != -1) ? rightSearch : mid;
            } else if (arr[mid] < target) {
                return lastOccurrence(arr, mid + 1, end, target);
            } else if (arr[mid] > target) {
                return lastOccurrence(arr, start, mid - 1, target);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 2, 2, 5, 7, 7, 7, 8, 8, 9, 11, 11};
        int target = 2;
    }
}
