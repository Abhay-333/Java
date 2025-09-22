package LinkedList.Level1;

public class MiddleOfLinkedList {
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    static class CustomLinkedList {
        int size;
        Node head, tail;

        CustomLinkedList() {
            head = null;
            tail = null;
            size = 0;
        }

        public int getSize() {
            return size;
        }

        public void add(int val) {
            Node node = new Node(val);
            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
            size++;
        }

        public int getMiddle() {
            int index = size / 2;
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp.val;
        }

        public int optimalCode() {
            // Time complexity: O(n/2) - O(n)
            // Space complexity: O(1)
            Node slow = head, fast = head;
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow.val;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node temp = head;
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

    public static void main(String[] args) {
        CustomLinkedList list1 = new CustomLinkedList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        System.out.println(list1.getMiddle());
        System.out.println(list1.optimalCode());
        System.out.println(list1);
    }
}
