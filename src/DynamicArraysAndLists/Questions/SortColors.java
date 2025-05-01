package DynamicArraysAndLists.Questions;

import java.util.Arrays;

public class SortColors {
    public static int[] sort(int arr[]){
        int start = 0, mid = 0, end = arr.length-1;

        while(mid <= end){
            if(arr[mid] == 0){
                int temp = arr[start];
                arr[start++] = arr[mid];
                arr[mid++] = temp;
            }else if(arr[mid] == 2){
                int temp = arr[end];
                arr[end--] = arr[mid];
                arr[mid] = temp;
            }else{
                mid++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {2,0,2,1,1,0};
        System.out.println(Arrays.toString(sort(arr)));
    }
}
