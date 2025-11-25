package BackTracking.Level2.Level1;

import java.util.ArrayList;

public class FindtheWinnerInTheCircularGame {
    public static int kill(ArrayList<Integer> arr, int k, int initialIndex) {
        if (arr.size() == 1) {
            return arr.get(0);
        } else {
            initialIndex = ((initialIndex + k) - 1) % arr.size();
            arr.remove(initialIndex);
            return kill(arr, k, initialIndex);
        }
    }

    public static void main(String[] args) {
        int n = 10, k = 4;
        ArrayList<Integer> list1 = new ArrayList<>();
//        Queue<ArrayList<Integer>> q1 = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            list1.add(i);
        }

        kill(list1, k, 0);

        System.out.println(list1);

    }

}
