package LinkedList.Level1;

public class MergeTwoSortedList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static class CustomLinkedList1 {
        int size;
        ListNode head, tail;

        CustomLinkedList1() {
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

        public CustomLinkedList1 mergeLinkedList(ListNode list1, ListNode list2) {
            CustomLinkedList1 list = new CustomLinkedList1();
            if (list1 == null && list2 == null) return list;
            ListNode temp1 = list1;
            ListNode temp2 = list2;

            while (temp1 != null && temp2 != null) {
                if (temp1.val <= temp2.val) {
                    list.add(temp1.val);
                    temp1 = temp1.next;
                } else if (temp2.val <= temp1.val) {
                    list.add(temp2.val);
                    temp2 = temp2.next;
                }
            }

            while (temp1 != null) {
                list.add(temp1.val);
                temp1 = temp1.next;
            }

            while (temp2 != null) {
                list.add(temp2.val);
                temp2 = temp2.next;
            }
            return list;
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

        public static String printList(ListNode head) {
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
//        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//            ListNode ans = new ListNode(-1);
//            ListNode temp = ans;
//            while(list1 != null && list2 != null){
//                if(list1.val <= list2.val){
//                    temp.next = list1;
//                    list1 = list1.next;
//                }else{
//                    temp.next = list2;
//                    list2 = list2.next;
//                }
//                temp = temp.next;
//            }
//            temp.next = list1 != null ? list1 : list2;
//
//            return ans.next;
//        }

        public ListNode recursiveMerge(ListNode list1, ListNode list2) {

            if (list1 == null) return list2;
            if (list2 == null) return list1;
            if (list1.val <= list2.val) {
                list1.next = recursiveMerge(list1.next, list2);
                return list1;
            } else {
                list2.next = recursiveMerge(list1, list2.next);
                return list2;
            }
        }

    }

    public static void main(String[] args) {
        CustomLinkedList1 list1 = new CustomLinkedList1();
        CustomLinkedList1 list2 = new CustomLinkedList1();
        CustomLinkedList1 list3 = new CustomLinkedList1();
        list1.add(1);
        list1.add(2);
        list1.add(4);
        list1.add(5);
        list2.add(1);
        list2.add(3);
        list2.add(4);
        System.out.println(list1);
        System.out.println(list2);
//        System.out.println(list3.mergeLinkedList(list1.head, list2.head));
        ListNode merged = list1.recursiveMerge(list1.head, list2.head);
        System.out.println(CustomLinkedList1.printList(merged));

    }
}
