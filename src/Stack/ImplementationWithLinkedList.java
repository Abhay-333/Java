package Stack;

public class ImplementationWithLinkedList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static class LinkedListWalaStack {
        ListNode head;
        int size;

        LinkedListWalaStack() {
            head = null;
            size = 0;
        }

        public void push(int val) {
            ListNode node = new ListNode(val);
            if (head != null) {
                ListNode temp = head;
                head = node;
                head.next = temp;
            } else {
                head = node;
            }
            size++;
        }

        public Integer pop() {
            ListNode ans;
            if (head != null) {
                ans = head;
                head = head.next;
            } else {
                return null;
            }
            size--;
            return ans.val;
        }

        public Integer peek() {
            return head.val;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            ListNode temp = head;
            while (temp != null) {
                sb.append(temp.val);
                if (temp.next != null) sb.append(" -> ");
                temp = temp.next;
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        LinkedListWalaStack stack1 = new LinkedListWalaStack();
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);

        System.out.println(stack1.pop());
        System.out.println(stack1.peek());
        System.out.println(stack1);
    }
}
