package BinarySearch;

import Arrays.Questions.binarySearch;

public class SearchInsertPosition {

    public static int binarySearch(int arr[],int target){
        int start = 0, end = arr.length-1;
        boolean found = false;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                found = true;
                return mid;
            }else if(arr[mid] < target){
                start = mid+1;
            }else if(arr[mid] > target){
                end = mid-1;
            }
        }

        if(!found){
            return start;
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,5,6};
        int target = 2;
        System.out.println(binarySearch(arr,target));
    }
}
