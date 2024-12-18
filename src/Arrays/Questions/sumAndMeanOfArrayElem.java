package Arrays.Questions;

import java.util.Scanner;

public class sumAndMeanOfArrayElem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0;
        double mean = 0.0;
        int arr[] = new int[n];

        for(int i = 0; i < arr.length; i++){
            int arrElem = sc.nextInt();
            arr[i] = arrElem;
            sum += arr[i];
            mean = sum / arr.length;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + mean);

    }

}
