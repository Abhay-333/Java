package BinarySearch.Level1;

public class recallingBinarySearch {
    public static int search(int arr[], int target) {
        // This is iterative approach we can also do it in a recursive approach
        int start = 0, end = arr.length - 1;
        boolean targetFound = false;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                targetFound = true;
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }
        }
//        System.out.println();
        if (!targetFound) {
            System.out.print("Target not found: ");
            return -1;
        }
        return 0;
    }

    public static int recursiveBinarySearch(int arr[], int start, int end,int target){
        if(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                return recursiveBinarySearch(arr, mid+1, end, target);
            }else if(arr[mid] > target){
                return recursiveBinarySearch(arr, start, mid-1, target);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
//        int arr[] = {2, 5, 6, 34, 63, 76, 87, 91};
        int arr[] = {};
        // System.out.println(search(arr, 63));
        System.out.println(recursiveBinarySearch(arr,0,arr.length-1,63));

    }
}
