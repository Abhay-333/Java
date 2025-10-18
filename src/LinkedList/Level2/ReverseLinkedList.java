package LinkedList.Level2;

import java.util.LinkedList;

public class ReverseLinkedList {
    static class ListNode {
        int val;
        ListNode next;

//        ListNode() {
//        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();

            return sb.toString();
        }
    }

    static class CustomLinkedList3 {
        int size;
        ListNode head, tail;

        CustomLinkedList3() {
            head = null;
            tail = null;
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

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            ListNode temp = head;
            while (temp != null) {
                sb.append(temp.val);
                if (temp.next != null) {
                    sb.append(" -> ");
                }
                temp = temp.next;
            }

            return sb.toString();
        }

        public void reverse() {
            ListNode previous = null, current = head;
            while (current != null) {
                ListNode temp = current.next;
                current.next = previous;
                previous = current;
                current = temp;
            }
            head = previous;
        }

        public ListNode recursiveReverse(ListNode current, ListNode previous) {
            if (current == null) {
                head = previous;
                return previous;
            } else {
                ListNode temp = current.next;
                current.next = previous;
                previous = current;
                current = temp;
                head = previous;
            }
            return recursiveReverse(current, previous);
        }

    }

    public static void main(String[] args) {
        CustomLinkedList3 list1 = new CustomLinkedList3();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println(list1);
        list1.recursiveReverse(list1.head, null);
        System.out.println(list1);
    }
}
