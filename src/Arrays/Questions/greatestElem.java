package Arrays.Questions;

import java.util.Scanner;

public class greatestElem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            int arrElem = sc.nextInt();
            arr[i] = arrElem;
        }

        greatestElem obj = new greatestElem();
        obj.greatestElemInArray(arr);

    }

    public void greatestElemInArray(int[] arr) {
        int greatestElement = 0, indexOfGreatestElem = 0;

        // arr[] = {25, 52, 37, 34, 73}

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > greatestElement){
                greatestElement = arr[i];
                indexOfGreatestElem = i;
            }
        }
        System.out.println("Max element = " + greatestElement + " found at index " + indexOfGreatestElem);

    }
}
