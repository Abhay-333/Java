package Module4DSAEssentials.CollectionAPI;

import java.util.HashMap;
import java.util.Map;

public class frequencyCountUsingMap {
    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 61, 2, 1, 52, 26, 12, 141, 1, 2, 25, 21, 42};
        Map<Integer, Integer> map1 = new HashMap<>();

        for (int element : arr) {
            if(map1.containsKey(element)){
                int prev = map1.get(element);
                prev++;
                map1.put(element,prev);
            }else{
                map1.put(element, 1);
            }
        }

        System.out.println(map1);
    }
}
