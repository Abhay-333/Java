package Arrays.Questions;

import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isSorted = true;

        for(int i = 1; i < arr.length; i++){
            if(arr[i-1] >= arr[i]){
                isSorted = false;
                break;
            }
        }

//        System.out.println(AscendingOrder.isSorted(arr) ? "YES" : "NO");

        System.out.println(isSorted);

    }

//    public static boolean isSorted(int arr[]){
//        for(int i = 1; i < arr.length; i++){
//            if(arr[i-1] >= arr[i]){
//                return false;
//            }
//        }
//        return true;
//    }

}
