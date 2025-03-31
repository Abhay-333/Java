import java.util.Objects;

//class Pair{
//    int a, b;

//    public Pair(int a, int b) {   // all this code can be replace by using a record
//        this.a = a;
//        this.b = b;
//    }
//
//    public int getA() {
//        return a;
//    }
//
//    public int getB() {
//        return b;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Pair pair = (Pair) o;
//        return a == pair.a && b == pair.b;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(a, b);
//    }
//}

record Pair(int a, int b){
    public int sum(){
        return a + b;
    }
}  // using this one line of code can replace above code

public class javaNewFeatures {
    public static void main(String[] args) {
        Pair p1 = new Pair(12,13);
        System.out.println(p1.sum());
    }
}
