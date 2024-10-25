public class IncrementDecrement{
    public static void main(String[] args){
        int a = 5;
        System.out.println(a++ + ++a + a++);

//        int b = -2, c=3;
//        int d = b-- - --c + c++ - --b + b++/5;
//        System.out.println(d);
//
        int b = -2, c = 3;
        int d = b-- - --c + c++ - --b + (b++ / 5);
        System.out.println(d);

        int e = 5, f = 2;
        int g = ++e + f++;
        System.out.println(g);

    }
}