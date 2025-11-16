package BackTracking.Level1;

import java.util.Stack;

public class TowerOfHanoi {
    public static int towerOfHanoi(int n, int from, int to, int aux) {
        if(n == 1){
            return n;
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(towerOfHanoi(3, 1,2,3));
    }

}
