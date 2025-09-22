package LinkedList.ImplementationOfLinkedList;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class DesignLinkedList {
    int size;
    Node head, tail;

    DesignLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        Node temp = head;
        while (index > 0) {
            temp = temp.next;
            index--;
        }
        return temp.val;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public void addAtTail(int val) {
        Node node = new Node(val);
        if (head == null && tail == null) {
            head = node;
            tail = node;
        } else {
            addAtIndex(size, val);
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("size is " + size + " inserting element " + index);
        else if (index == 0) {
            addAtHead(val);
        } else if (index == size-1) {
            addAtTail(val);
        } else {
            Node node = new Node(val);
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Size is " + size + " Trying to delete at " + index);
        } else if (index == 0) {
            head = head.next;
            if(head == null){
                tail = null;
            }
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
                System.out.println(temp.val);
            }
            Node deleteNode = temp.next;
            if (index == size - 1) {
                tail = temp;
                tail.next = null;
            }
            temp.next = deleteNode.next;
            size--;
        }

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
