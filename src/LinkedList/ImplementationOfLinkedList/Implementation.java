package LinkedList.ImplementationOfLinkedList;

public class Implementation {
    public static void recursiveListNode(ListNode head) {
        if (head == null) {
            return;
        }
//        System.out.print(head.data + " ");
        recursiveListNode(head.next);
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(10);
        ListNode l2 = new ListNode(20);
        ListNode l3 = new ListNode(30);
        ListNode l4 = new ListNode(40);
        ListNode l5 = new ListNode(50);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = null;

        ListNode temp = l1;
        while (temp != null) {
//            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        recursiveListNode(l1);

        MyLinkedList list1 = new MyLinkedList();

        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
//        System.out.println(list1);
//        list1.addFirst(40);
//        System.out.println(list1);
//        list1.add(1,100);
//        list1.addLast(200);
//        list1.deleteFirst();
//        list1.deleteLast();
//        System.out.println(list1.deleteAt(2));
//        System.out.println(list1);

        DesignLinkedList list2 = new DesignLinkedList();
        list2.addAtHead(10);
        list2.addAtHead(20);
        list2.addAtHead(30);
        list2.addAtHead(40);
//        System.out.println(list2.get(1));
//        list2.addAtTail(200);
//        list2.addAtIndex(1, 15);
//        System.out.println(list2);
//        list2.deleteAtIndex(2);
        System.out.println(list2);

    }
}
