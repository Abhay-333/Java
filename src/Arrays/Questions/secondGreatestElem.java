package Arrays.Questions;

import java.util.Scanner;

public class secondGreatestElem {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int arr[] = new int[n];

        int arr[] = {36, 36, 55, 64, -47};

//        for(int i = 0; i < n; i++){
//            arr[i] = sc.nextInt();
//        }

//        int first = Math.max(arr[0], arr[1]), second = Math.min(arr[0], arr[1]);
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        // i have given Integer minimum value possible i.e -2,147,483,648 in both the variables first and second
        // then i compare both the variables. example user input n=5, arr={52, 62,23,73,2} then we go in the for loop
        // of j then we compare each element of array with the first

//        if (arr[j] > first) then second = first; first = arr[j]
//        else if(arr[j] > second && arr[j] < first) then second = arr[j]

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > first) {
                    second = first;
                    first = arr[j];
                } else if (arr[j] > second) {
                    second = arr[j];
                }
            }

        System.out.println("Second greatest element = " + second);
    }
}
