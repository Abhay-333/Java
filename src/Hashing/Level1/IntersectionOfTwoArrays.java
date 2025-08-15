package Hashing.Level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
//        int arr1[] = {1,2,2,1};
        int arr1[] = {4,9,5};
        int arr2[] = {9,4,9,8,4};

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int num : arr1){
            if(!set1.contains(num)){
                set1.add(num);
            }
        }

        for(int num : arr2){
            if(!set2.contains(num)){
                set2.add(num);
            }
        }
        set1.retainAll(set2);
        int result[] = new int[set1.size()];
        int i = 0;
        for(int num : set1){
            result[i++] = num;
        }
        System.out.println(Arrays.toString(result));
        double a, b, c;


    }
}
