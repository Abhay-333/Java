package LinkedList.Level2;

import java.util.List;

public class CustomLinkedList {
    public static class ListNode {
        public ListNode next;
        public ListNode random;
        public int val;

        public ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode random){
            this.val = val;
            this.random = random;
        }
    }

    int size;
    public ListNode head;
    public ListNode tail;

    public CustomLinkedList() {
        size = 0;
        head = null;
        tail = null;
    }

    public int getSize() {
        return size;
    }

    public CustomLinkedList(int val) {
        ListNode head = new ListNode(val);
        size = 1;
        tail = head;
        this.head = head;
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
}
