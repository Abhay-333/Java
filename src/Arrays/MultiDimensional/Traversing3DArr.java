package Arrays.MultiDimensional;

import java.util.Arrays;
import java.util.Scanner;

public class Traversing3DArr {
    public static void main(String[] args) {
        // creating 3d arr and accessing each element in it
        Scanner sc = new Scanner(System.in);

        int arr[][][] = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}, {{9, 10}, {11, 12}}};

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                for (int k = 0; k < arr[j].length; k++) {
//                    System.out.print(arr[i][j][k] + " ");
//                }
//            }
//        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
//                for (int k = 0; k < arr[i][j].length; k++) {
//                }
                    System.out.println(Arrays.toString(arr[i][j]));
            }
        }

        // Accepting Array elements

//        System.out.println("Enter the size of Outer Array: ");
//        int sizeOfOuterArr = sc.nextInt();
//
//        System.out.println("Enter the size of Middle Array: ");
//        int sizeOfMidArr = sc.nextInt();
//
//        System.out.println("Enter the size of Inner Array: ");
//        int sizeOfInnerArr = sc.nextInt();
//
//        int arr[][][] = new int[sizeOfOuterArr][sizeOfMidArr][sizeOfInnerArr];
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print("Enter Inner Array elements: ");
//                for (int k = 0; k < arr[i][j].length; k++) {
//                    arr[i][j][k] = sc.nextInt();
//                }
//                System.out.println("The size of Inner arr is: " + arr[i][j].length);
//            }
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                for (int k = 0; k < arr[i][j].length; k++) {
//                    System.out.print(arr[i][j][k] + " ");
//                }
//                System.out.println();
//            }
//        }

    }
}
