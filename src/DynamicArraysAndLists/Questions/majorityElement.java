package DynamicArraysAndLists.Questions;

import java.util.*;

public class majorityElement {
    public static int optimisedCode1(int arr[]) {
        //Time Complexity: O(n+m) => O(n)
        //Space Complexity: O(1)

        // By Using Moore's Algo

        int probableAns = arr[0], votes = 0, i = 0;

        while (i < arr.length) {
            if (arr[i] == probableAns) {
                votes++;
            } else {
                votes--;
                if (votes == 0) {
                    probableAns = arr[i];
                    votes++;
                }
            }
            i++;
        }

        // Optional Code
//        int counter=0;
//        for (int num : arr){
//            if(num == probableAns){
//                counter++;
//            }
//            if(counter > arr.length/2){
//                return counter;
//            }
//        }
        return probableAns;
    }

    public static int bruteForce(int arr[]) {
        //Time Complexity: O(n+m) => O(n)
        //Space Complexity: O(n)

        Map<Integer, Integer> map1 = new HashMap<>();

        for (int element : arr) {
            map1.put(element, map1.getOrDefault(element, 0) + 1);
        }

        int maxOccurence = 0, ans = 0;
        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            if (entry.getValue() > maxOccurence) {
                maxOccurence = entry.getValue();
                ans = entry.getKey();
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {8, 8, 7, 7, 7};
//        System.out.println(bruteForce(arr));
        System.out.println(optimisedCode1(arr));
    }
}
