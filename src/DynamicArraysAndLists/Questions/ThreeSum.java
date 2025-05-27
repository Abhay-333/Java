package DynamicArraysAndLists.Questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ThreeSum {
    public static List<List<Integer>> optimisedCode1(int[] arr) {
        List<List<Integer>> list1 = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int j = i + 1, k = arr.length - 1;

            while (j < k) {
                if (arr[i] + arr[j] + arr[k] == 0) {
                    list1.add(Arrays.asList(arr[i], arr[j], arr[k]));
    
                    while (j < k && arr[j] == arr[j + 1]) {
                        j++;
                    }
                    while (j < k && arr[k] == arr[k - 1]) {
                        k--;
                    }
                    j++;
                    k--;
                } else if (arr[i] + arr[j] + arr[k] < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return list1;
    }

    public static List<List<Integer>> bruteForce(int[] arr) {
        List<List<Integer>> list1 = new ArrayList<>();
        int i = 0;

        while (i < arr.length - 2) {
            int j = i + 1;
            int k = j + 1;
            while (j < arr.length - 1) {
                if (arr[i] + arr[j] + arr[k] == 0) {
                    List<Integer> list2 = Arrays.asList(arr[i], arr[j], arr[k]);
                    Collections.sort(list2);
                    if (!list1.contains(list2)) {
                        list1.add(list2);
                    }
                }
                k++;
                j++;
            }
            i++;
        }
        return list1;
    }

    public static void main(String[] args) {
        int arr[] = {-1, 0, 1, 2, -1, -4};
//        int arr[] = {1000000, -1000000, 0};
//        int arr[] = {-2, -2, 2, 2, 0};
//        System.out.println(bruteForce(arr));
        System.out.println(optimisedCode1(arr));
    }
}
