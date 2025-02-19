package StringsInDepth;

public class StringBuilderAPI {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (char i = 'a'; i < 'z'; i++) {
            sb.append(i);
//            System.out.println("Capacity: " + sb.capacity() + ", Length = " + sb.length());
//            System.out.println(sb);
        }

//        String str = "Hello kaise ho";  // reverse it using stringBuilder
//        str = new StringBuilder(str).reverse().toString();
//        System.out.println(str);

        StringBuilder sb1 = new StringBuilder("abc");
        sb1.append("def").reverse().insert(3, "---");
        System.out.println(sb1);
    }
}
