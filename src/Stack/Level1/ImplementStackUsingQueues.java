package Stack.Level1;
import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {
    Queue<Integer> q1, q2;

    ImplementStackUsingQueues(){
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x){
        q1.offer(x);
    }

    public Integer pop(){
        while(q1.size() != 1){
            q2.offer(q1.poll());
        }
        int ans = q1.poll();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return ans;
    }

    public Integer top(){
        while(q1.size() != 1){
            q2.offer(q1.poll());
        }
        int ans = q1.poll();
        Queue<Integer> temp = q1;

        return 0;
    }

    public static void main(String[] args) {
        ImplementStackUsingQueues st1 = new ImplementStackUsingQueues();
        st1.push(10);
        st1.push(20);
        st1.push(30);

    }
}
