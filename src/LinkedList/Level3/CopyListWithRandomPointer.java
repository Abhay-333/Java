package LinkedList.Level3;

import java.util.HashMap;

public class CopyListWithRandomPointer {

    public static class ListNodeWithRandom {
        int val;
        ListNodeWithRandom next, random;

        ListNodeWithRandom(int val) {
            this.val = val;
        }
    }

    public static class CustomLinkedListWithRandom {
        int size;
        ListNodeWithRandom head, tail;

        CustomLinkedListWithRandom() {
            head = null;
            tail = null;
            size = 0;
        }

        public void add(int val) {
            ListNodeWithRandom node = new ListNodeWithRandom(val);
            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
            size++;
        }

    }

    public static void main(String[] args) {
        CustomLinkedListWithRandom list1 = new CustomLinkedListWithRandom();
        list1.add(7);
        list1.add(13);
        list1.add(11);
        list1.add(10);
        list1.add(1);

        list1.head.random = null;
        list1.head.next.random = list1.head;
        list1.head.next.next.random = list1.head.next.next.next.next;
        list1.head.next.next.next.random = list1.head.next.next;
        list1.head.next.next.next.next.random = list1.head;

        CustomLinkedListWithRandom ans = new CustomLinkedListWithRandom();
        HashMap<ListNodeWithRandom, ListNodeWithRandom> map1 = new HashMap<>();

        ListNodeWithRandom h1 = list1.head, h2 = new ListNodeWithRandom(list1.head.val);

        map1.put(h1, h2);
        while (h1 != null) {
            if (h1.next != null) {
                h2.next = new ListNodeWithRandom(h1.next.val);
                map1.put(h1.next, h2.next);
            }
            h1 = h1.next;
            h2 = h2.next;
        }

        h1 = list1.head;
        h2 = ans.head;

        while(h1 != null){
            if(h1.random != null){
                h2.random = map1.get(h1.random);
            }
            h1 = h1.next;
            h2 = h2.next;
        }
    }
}
