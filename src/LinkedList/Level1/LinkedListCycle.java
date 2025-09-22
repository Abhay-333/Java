package LinkedList.Level1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LinkedListCycle {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    static class CustomLinkedList2 {
        int size;
        ListNode head, tail;

        CustomLinkedList2() {
            head = null;
            size = 0;
        }

        public void add(int val) {
            ListNode node = new ListNode(val);
            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
            size++;
        }

        public boolean checkCycle() {
            // Time Complexity: O(n)
            // Space Complexity: O(n)
            Set<ListNode> set1 = new HashSet<>();
            ListNode temp = head;
            while (temp != null) {
                if (set1.contains(temp)) {
                    break;
                } else {
                    set1.add(temp);
                }
                temp = temp.next;
            }
            return true;
        }

        public boolean optimalCode() {
            // Using Floyd's Cycle Finding algo
            // Time Complexity: O(n)
            // Space Complexity: O(1)
            ListNode slow = head, fast = head;
            while (fast != null && fast.next != null) {
                if(slow == fast){
                    return true;
                }
                fast = fast.next.next;
                slow = slow.next;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        CustomLinkedList2 list1 = new CustomLinkedList2();
        list1.add(3);
        list1.add(2);
        list1.add(0);
        list1.add(-4);
        list1.tail.next = list1.head.next;
        System.out.println(list1.checkCycle());
    }
}
