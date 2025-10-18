package LinkedList.Level2;

public class RemoveDuplicateFromSortedList {
    static class ListNode {
        ListNode next;
        int val;

        ListNode(int val) {
            this.val = val;
        }
    }

    static class CustomLinkedList4 {
        ListNode head, tail;
        int index, size;

        CustomLinkedList4() {
            size = 0;
            index = 0;
            head = null;
            tail = null;
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

        public void removeDuplicates() {
            if (head == null || head.next == null) return;

            ListNode temp = head;
            while (temp.next != null) {
                if (temp.val == temp.next.val) {
                    temp.next = temp.next.next;
                } else {
                    temp = temp.next;
                }
            }
        }

        public void recursiveRemovalOfDuplicates(ListNode head){
            if(head == null || head.next == null) return;

            if(head.next.val == head.val){
                head.next = head.next.next;
                recursiveRemovalOfDuplicates(head);
            }else{
                recursiveRemovalOfDuplicates(head.next);
            }
        }

    }

    public static void main(String[] args) {
        CustomLinkedList4 list1 = new CustomLinkedList4();
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(2);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(4);
        list1.add(4);
        System.out.println(list1);
//        list1.removeDuplicates();
        list1.recursiveRemovalOfDuplicates(list1.head);
        System.out.println(list1);
    }
}
