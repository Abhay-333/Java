package Module4DSAEssentials.CollectionAPI;

import java.util.*;

public class example1{
    public static void main(String[] args) {
//        Syntax of Collection API -> List -> ArrayList
//        List<Integer> list1 = new ArrayList<>();    this is also allowed
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(2,100);   //Insertion

        System.out.println(list1);
        System.out.println(list1.contains(100));

//        for(int i = 0; i < list1.size(); i++){
//            System.out.println(list1.get(i));
//        }


        Set<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(10);
        set1.add(20);
        System.out.println(set1);

        int arr[] = {124342,253,2,3,6,4,83,85,457,};
        Set<Integer> set2 = new HashSet<>();        // Hashset will not give output in asending order
        for (int a : arr) set2.add(a);

        System.out.println(set2);

        Set<Integer> set3 = new TreeSet<>();        // TreeSet will give output in asending order
        for (int a : arr) set3.add(a);

        System.out.println(set3);

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Abhay", 1);
        map1.put("Akash", 2);
        map1.put("Akshay", 3);

//        System.out.println(map1.containsKey("Abhay"));
//        System.out.println(map1.containsKey("abhay"));

        for (Map.Entry<String, Integer> e : map1.entrySet()){       // method to display the content of map
            System.out.println(e.getKey() + " => " + e.getValue());
        }

        map1.forEach((k,v)-> System.out.println(k + " => " + v));   // method to display the content of map
    }
}