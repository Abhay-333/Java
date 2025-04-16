package Math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KthFactor {
    public static int kthFactorOfn(int n, int k) {
        if (k > n) return -1;
        else if (n < 2) {
            return 1;
        } else if (n == 2) {
            return 2;
        }

        List<Integer> list1 = new ArrayList<>();

        for (int i = 2; i * i < n; i++) {
            if (n % i == 0) {
                list1.add(i);
                if(i*i != n){
                    list1.add(n/i);
                }
            }
        }
        list1.sort(null);
        System.out.println(list1);
        list1.size();
        return list1.get(k-1);
    }

    public static void main(String[] args) {
        int n = 12, k = 3;
        System.out.println(kthFactorOfn(n, k));
    }
}
