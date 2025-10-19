package Queue;

public class Implementation {
    public static class CustomQueue {
        // perform 3 operations enqueue/offer, peek(), dequeue/ poll()

        private int front, rear, size;
        private int arr[];

        CustomQueue(int length) {
            front = 0;
            rear = -1;
            arr = new int[length];
            size = 0;
        }

        public int getSize() {
            return size;
        }

        public void enqueue(int val) throws Exception {
            if (rear != size) {
                arr[++rear] = val;
                size++;
            } else {
                throw new IndexOutOfBoundsException("Queue if full");
            }
        }

        public int peek(){

            return rear != -1 ? arr[front] : null;
        }

        public void dequeue() throws Exception {
            if(rear == -1) {
                throw new Exception("Queue if empty");
            }
            int temp = front;
            for(int i = front+1; i <= rear; i++){
                arr[temp++] = arr[i];
            }
            rear--;
            size--;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (size == 0) {
                return "[]";
            }
            sb.append("[");
            for (int i = front; i <= rear; i++) {
                sb.append(arr[i]);
                if(i < rear) sb.append(", ");
            }
            sb.append("]");
            return sb.toString();
        }

    }

    public static void main(String[] args) throws Exception {
        CustomQueue q1 = new CustomQueue(5);
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.enqueue(40);
        q1.dequeue();
        q1.dequeue();
        q1.peek();
        System.out.println(q1.peek());
        System.out.println(q1.toString());
    }
}
