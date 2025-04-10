package Arrays.Questions;

import java.util.Arrays;
import java.util.Scanner;

public class moveZeros {
    public static void main(String[] args) {
        // Note: input for this program will be in zeros and in ones

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[j-1] == 0){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
