package Queue;

public class LinkedListQueue {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static class LinkedListQ {
        int size;
        ListNode head, tail;

        LinkedListQ() {
            size = 0;
            head = null;
            tail = null;
        }

        public void offer(int val) {
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

        public Integer poll() {
            if (head == null) {
                return null;
            }
            Integer ans = head.val;
            head = head.next;
            if(head == null) tail = null;
            size--;
            return ans;
        }

        public Integer peek() {
            if(head == null){
                return null;
            }
            return head.val;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (head == null) {
                sb.append((String) null);
                return sb.toString();
            }
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
        LinkedListQ q1 = new LinkedListQ();

        q1.offer(10);
        q1.offer(20);
        q1.offer(30);
        q1.offer(40);
        q1.offer(50);

        System.out.println(q1.poll());
        System.out.println(q1.poll());
        System.out.println(q1.poll());
        System.out.println(q1.peek());
        System.out.println(q1);

    }
}
