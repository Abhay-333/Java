    package LinkedList.Level3;


    import LinkedList.Level2.CustomLinkedList.ListNode;
    import LinkedList.Level2.CustomLinkedList;


    public class ReverseNodeInKGroup {
        public static void reverse(ListNode start, ListNode end) {
            ListNode current = start, previous = null;

            while (previous != end) {
                ListNode temp = current.next;
                current.next = previous;
                previous = current;
                current = temp;
            }
        }

        public static ListNode connectTheNodes(ListNode head, int k) {
            if (k == 1 || head == null || head.next == null) return head;    // Worst Inputs possible
            ListNode start = head, end = head;
            int index = k - 1;
            while (index != 0) {
                end = end.next;
                if (end == null) return head;
                index--;
            }
            ListNode ans1 = connectTheNodes(end.next, k);
            reverse(start, end);
            start.next = ans1;
            return end;
        }

        public static void main(String[] args) {
            CustomLinkedList list1 = new CustomLinkedList();
            // Step 1: Sabse Pehle list ko divide karo into k groups
            // Step 2: uske baad k nodes ko bhej do reversing ke liye function using start and end nodes
            // Step 3: Define a function jo 2 nodes leta ho start and end usske baad unhe reverse kr ke send krta ho
            // Step 4: Finally we can call this function multiple times until we get or expected output

            int k = 3;
            for (int i = 1; i < 12; i++) {
                list1.add(i);
            }

            System.out.println(list1);
            ListNode ans = connectTheNodes(list1.head, k);
            list1.head = ans;
    //        while (ans != null) {
    //            System.out.print(ans.val + " ");
    //            ans = ans.next;
    //        }
            System.out.println();
            System.out.println(list1);
        }
    }
