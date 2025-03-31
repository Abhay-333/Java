public class StackMemoryExecution {
    public static void m1(){
        System.out.println("This is m1");
        m2();
    }

    public static void m2(){
        System.out.println("This is m2");
        m3();
    }
    public static void m3(){
        System.out.println("This is m3");
        m4();
    }

    public static void m4(){
        System.out.println("This is m4");
    }

    public static void main(String[] args) {
        m1();
    }
}
