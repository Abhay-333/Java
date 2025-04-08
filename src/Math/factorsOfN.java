package Math;

import java.util.ArrayList;
import java.util.List;

public class factorsOfN {
    public static void main(String[] args) {
        int n = 100;
        List<Integer> list1 = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                list1.add(i);
                if(i*i != n){
                   list1.add(n/i);
                }
            }
        }

        System.out.println(list1);

    }
}
