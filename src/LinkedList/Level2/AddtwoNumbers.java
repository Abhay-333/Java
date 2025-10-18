package LinkedList.Level2;

public class AddtwoNumbers {

    public static void main(String[] args) {
        CustomLinkedList list1 = new CustomLinkedList();
        CustomLinkedList list2 = new CustomLinkedList();
        list1.add(2);
        list1.add(4);
        list1.add(3);
        list2.add(5);
        list2.add(6);
        list2.add(4);
        System.out.println(list1);
        System.out.println(list2);

        CustomLinkedList list3 = new CustomLinkedList(-1);
        CustomLinkedList.ListNode head1 = list1.head, head2 = list2.head;

        int carry = 0;

        while (head1 != null || head2 != null || carry != 0) {
            int val1 = head1 == null ? 0 : head1.val;
            int val2 = head2 == null ? 0 : head2.val;
            int sum = val1 + val2 + carry;

            carry = sum / 10;
            list3.add(sum % 10);
            if (head1 != null) head1 = head1.next;
            if (head2 != null) head2 = head2.next;
        }
        list3.head = list3.head.next;
        System.out.println(list3);
    }
}
