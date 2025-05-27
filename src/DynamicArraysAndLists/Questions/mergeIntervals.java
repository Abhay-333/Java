package DynamicArraysAndLists.Questions;

import java.util.*;

public class mergeIntervals {
//    public static int[][] bruteForce1(int[][] intervals) {
//        if (intervals.length <= 1)
//            return intervals;
//
//        boolean isMergingPossible = false;
//        int i = 0, j = 1;
//        int parentArr[][] = new int[intervals.length - 1][intervals[i].length];
//
//        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
//
//        while (j < intervals.length) {
//            if (intervals[j][0] <= intervals[i][0]) {
//                isMergingPossible = true;
//                int subArr[] = new int[intervals[i].length];
//
//                subArr[0] = intervals[j][0];
//                if (intervals[i][1] < intervals[j][1]) {
//                    subArr[1] = intervals[j][1];
//                } else {
//                    subArr[1] = intervals[i][1];
//                }
//                parentArr[i] = subArr;
//                j++;
//                int k = j;
//                while (k < intervals.length) {
//                    parentArr[k - 1] = intervals[k++];
//                }
//            } else if (intervals[i][1] >= intervals[j][0]) {
//                isMergingPossible = true;
//                int subArr[] = new int[intervals[i].length];
//
//                subArr[0] = intervals[i][0];
//                if (intervals[i][1] < intervals[j][1]) {
//                    subArr[1] = intervals[j][1];
//                } else {
//                    subArr[1] = intervals[i][1];
//                }
//                parentArr[i] = subArr;
//                j++;
//                int k = j;
//                while (k < intervals.length) {
//                    parentArr[k - 1] = intervals[k++];
//                }
//            }
//            i++;
//            j++;
//        }
//        return isMergingPossible ? parentArr : intervals;
//    }

    public static int[][] optimisedCode1(int arr[][]) {
        // Time Complexity:
        // Space Complexity: O(n)
        List<int[]> list1 = new ArrayList<>();
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < arr.length; i++) {
            int size = list1.size();
            if (size == 0 || list1.get(size - 1)[1] < arr[i][0]) {
                list1.add(arr[i]);
            } else {
                list1.get(size - 1)[1] = Math.max(list1.get(size - 1)[1], arr[i][1]);
            }
        }

        int newArr[][] = new int[list1.size()][2];
        int j = 0;
        for (int[] i : list1) {
            newArr[j++] = i;
        }
        arr = newArr;

        return arr;
    }

    public static int[][] bruteForce(int arr[][]) {
        // Time complexity: O(n^2)
        // Space complexity: O(n)
        int j = 1, i = 0;
        while (i < arr.length) {
            Arrays.sort(arr[i++]);
        }

        i = 0;
        while (j < arr.length) {
            if (arr[i][1] >= arr[j][0]) {
                int parentArr[][] = new int[arr.length - 1][arr[i].length];
                int subArr[] = new int[arr[i].length];
                subArr[0] = arr[i][0];
                if (arr[i][1] < arr[j][1]) {
                    subArr[1] = arr[j][1];
                } else {
                    subArr[1] = arr[i][1];
                }
                parentArr[i] = subArr;
                j++;
                int k = j;
                while (k < arr.length) {
                    parentArr[k - 1] = arr[k++];
                }
            }
            i++;
            j++;
        }
        return arr;
    }

    public static void main(String[] args) {
//        int arr[][] = {{1,4},{4,5}};
//        int arr[][] = {{4, 5}, {1, 4}};
        int arr[][] = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

//        System.out.print(Arrays.deepToString(bruteForce(arr)));
        System.out.print(Arrays.deepToString(optimisedCode1(arr)));
    }

}
