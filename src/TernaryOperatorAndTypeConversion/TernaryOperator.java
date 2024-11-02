package TernaryOperatorAndTypeConversion;

public class TernaryOperator {
    public static void main(String[] args) {

        int a =  1;
        double b =  10;
        System.out.println(-a);
        System.out.println(b);
        if(a>2){
        System.out.println((a%2==0 ? "ha" : "nahi") );
        }

        System.out.println(  a>2 ?(a%2==0 ? "ha" : "nahi") : "false" );


    }
}
