package SortingAlgorithms.CyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findAllNumbersDisappearedinAnArray {
    public static List<Integer> cyclicSort(int arr[]) {
        List<Integer> list1 = new ArrayList<>();
        int i = 0;

        while (i < arr.length) {

            int correctIndex = arr[i] - 1;
            if (arr[i] == arr[correctIndex]) i++;
            else if (arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
            System.out.println(Arrays.toString(arr));
        }
        int j = 0;
        while (j < arr.length) {
            if (arr[j] - 1 != j) {
                list1.add(j + 1);
            }
            j++;
        }

        return list1;
    }

    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(cyclicSort(arr));
    }
}
