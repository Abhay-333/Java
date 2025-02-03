package StringsInDepth;

public class strings {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");
        char[] s5 = {'A', 'b', 'h', 'a', 'y'};
        String s6 = new String(s5);

//        System.out.println(s1 == s2);
//        System.out.println(s1 == s3);
//        System.out.println(s1 == s4);
//        System.out.println(s6);

        String s8 = "Shery";
//        String s8 = "She";
//        System.out.println(s8.compareTo("Shery")); // this will print the difference between S - s(ASCII values)
//        System.out.println(s8.compareTo("Sheay")); // this will print the difference between r - a(ASCII values)
//        System.out.println(s8.compareTo("She")); // this will print how many letters are less in given(She) string
//        System.out.println(s8.compareTo("Shery")); // this will print how many letters are more in given(Shery) string


    }
}
