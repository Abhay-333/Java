package Queue;

public class CircularQueue {
    public static class CircularQ {
        private int front, rear, size, capacity;
        private int[] arr;

        CircularQ(int capacity) {
            arr = new int[capacity];
            rear = front = -1;
            size = 0;
            this.capacity = capacity;
        }

        public void offer(int val) {
            if (isFull()) {
                System.out.println("Q is Full");
            } else {
                if (rear == -1) front = 0;
                rear = (rear + 1) % capacity;
                arr[rear] = val;
                size++;
            }
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == capacity;
        }

        public int poll() {
            if (isEmpty()) {
                System.out.println("Q is Empty");
            }
            int ans = arr[front];
            front = (front + 1) % capacity;
            size--;
            return ans;
        }

        public int peek() {
            return isEmpty() ? null : arr[front];
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (size == 0) return "[]";

            sb.append("[");
            if(front == -1) front = 0;

            for (int i = front; size-- > 0; i = (i + 1) % capacity) {
                sb.append(arr[i]);
                if (i < rear) sb.append(", ");
            }

            sb.append("]");
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        CircularQ q1 = new CircularQ(5);
        q1.offer(10);
        q1.offer(20);
        q1.offer(30);
        q1.offer(40);
        q1.offer(50);
        q1.offer(50);
        q1.offer(50);
        q1.offer(50);
        System.out.println(q1.poll());
        System.out.println(q1.poll());
        System.out.println(q1.poll());
        System.out.println(q1.poll());
        System.out.println(q1.peek());
        System.out.println(q1);
    }
}
