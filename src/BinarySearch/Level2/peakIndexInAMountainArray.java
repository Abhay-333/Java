package BinarySearch.Level2;

public class peakIndexInAMountainArray {
    public static int findPeakIndex(int arr[]){
        int start=0, end = arr.length-1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]) return mid;
            if(arr[mid+1] > arr[mid]){
                start = mid+1;
            }else if (arr[mid+1] < arr[mid]){
                end = mid-1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int arr[] = {0,10,5,2};
        System.out.println(findPeakIndex(arr));
    }
}
