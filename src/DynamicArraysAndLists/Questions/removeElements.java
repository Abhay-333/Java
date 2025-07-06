package DynamicArraysAndLists.Questions;

public class removeElements {
    public static int bruteForce(int arr[], int val) {
        // Time Complexity: O(n)
        // Space Complexity: O(n) can we do it in O(1)
        int k = 0, counter = 0;
//        int newArr[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                arr[i] = -1;
                counter++;
            } else {
                arr[i] = arr[i];
            }
            System.out.print(arr[i] + " ");
        }

        k = arr.length - counter;
        return k;
    }

    public static void main(String[] args) {
//        int arr[] = {3,2,2,3};
//        int arr[] = {0, 1, 2, 2, 3, 0, 4, 2};
        int arr[] = {1,1,2,3,4};
        System.out.println(bruteForce(arr, 1));
    }
}
