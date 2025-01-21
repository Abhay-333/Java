package Arrays.Questions;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int arr[] = {4, 5, 2, 6, 1};

        for (int i = 0; i < arr.length; i++) {
            int smallest = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[smallest]){
                    smallest = j;
                }
                if(i != smallest){
                    int temp = arr[i];
                    arr[i]= arr[smallest];
                    arr[smallest] = temp;
                }
            }
        }
            System.out.println(Arrays.toString(arr));
        System.out.println(41+"\n" + 51 + "\n");
        }

    }

