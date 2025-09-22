package LinkedList.ImplementationOfLinkedList;

public class MyLinkedList {
    ListNode head;
    ListNode tail;
    int size;

    MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(int num) {
        add(size, num); // Call to another add() overloaded function
    }

    public int size() {
        return size;
    }

    public void add(int index, int num) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index does not exists.");
        }
        if (index == 0) {
            addFirst(num);
            return;
        }
        if (index == size) {
            addLast(num);
            return;
        }

        // index > 0
        ListNode node = new ListNode(num);
        ListNode temp = head;
        index--;
        while (index > 0) {
            temp = temp.next;
            index--;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    public void addFirst(int num) {
        ListNode node = new ListNode(num);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public void addLast(int num) {
        ListNode node = new ListNode(num);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode node = head;
        while (node != null) {
            sb.append(node.data);
            if (node.next != null) {
                sb.append(", ");
            }
            node = node.next;
        }
        return sb.toString();
    }

    public void deleteFirst() {
        if (head == null) {
            throw new IndexOutOfBoundsException("The LinkedList is Empty");
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
    }

    public void deleteLast() {
        if (tail == null) {
            throw new IndexOutOfBoundsException("The LinkedList is Empty");
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            ListNode temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
        size--;
    }

    public Integer deleteAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            deleteFirst();
        }
        int val = head.data;
        ListNode temp = head;
        while (index - 1 > 0) {
            temp = temp.next;
            val = temp.next.data;
            index--;
        }
        temp.next = temp.next.next;
        size--;
        return val;
    }
}
