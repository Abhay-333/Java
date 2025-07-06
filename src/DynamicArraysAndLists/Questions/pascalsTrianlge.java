package DynamicArraysAndLists.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pascalsTrianlge {
    public static List<List<Integer>> bruteForce(int numRows) {
        List<List<Integer>> list1 = new ArrayList<>();
        // First iterate over the outer list
        // Second iterate over the inner list
        // Third Try to access previous list
        // Fourth using previous list calculate newRow

        for (int i = 0; i < numRows; i++) {
            List<Integer> newRow = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    newRow.add(1);
                } else {
                    int previous = list1.get(i - 1).get(j - 1), current = list1.get(i - 1).get(j);
                    newRow.add(previous+ current);
                }
            }
            list1.add(newRow);
        }
        return list1;
    }

    public static void main(String[] args) {
        int numsRows = 5;
        System.out.println(bruteForce(numsRows));
    }
}
