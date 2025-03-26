package NonLeetCodeQuestion;

public class CheckEvenOrOddUsingBitwise {
    public static void main(String[] args) {
        Integer a = 6;

        if((a&1) == 1){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
        System.out.println(a & 1);
    }
}
