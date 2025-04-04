package Recursion;

public class HCFUsingRecursion {

//    public static int HFC(int max, int min) {     // Using Euclidean's Algorithm
//        if(max == min) return max;
//        else if(max > min){
//            return HFC(max-min,min);
//        }else{
//            return HFC(min,min-max);
//        }
//    }

    public static int GCF(int a, int b){        // Optimized code time complex: O(log(min(a,b)))
        if(b == 0) return a;
        return GCF(b,a%b);
    }

    public static void main(String[] args) {
        int a = 14, b = 28;
        int max = Math.max(a, b), min = Math.min(a, b);
//        System.out.println(HFC(max, min));
        System.out.println(GCF(a, b));

    }
}
