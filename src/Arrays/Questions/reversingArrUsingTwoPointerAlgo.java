package Arrays.Questions;

import java.util.Scanner;

public class reversingArrUsingTwoPointerAlgo {
    public void reverseArr(int arr[]){

        int i = 0, j = arr.length -1;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for(int k = 0; k < arr.length; k++){
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int arr[] = {1,2,3,4,5};

//        for(int i = 0; i < arr.length; i++){
//            arr[i]=sc.nextInt();
//        }

        reversingArrUsingTwoPointerAlgo obj = new reversingArrUsingTwoPointerAlgo();
        obj.reverseArr(arr);

//        int arr[] = {1, 2, 3, 4, 5};
//        int n = arr.length;
//
//        for (int i = 0, j = arr.length - 1; i < arr.length - 1; i++) {
//            if (i < j) {
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//                j--;
//            }
//        }
//
//        System.out.println(Arrays.toString(arr));

    }
}
