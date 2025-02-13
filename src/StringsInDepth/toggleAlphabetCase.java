package StringsInDepth;

public class toggleAlphabetCase {
    public static void main(String[] args) {
        String s = "AcgD f D ", s2 = "";        // expected output: aCGdFd

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= ' ' && s.charAt(i) <= '@'){
                s2 += s.charAt(i);
                continue;
            } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                s2 = s2 + (char) (s.charAt(i) + 32);
            }else {
                s2 = s2 + (char) (s.charAt(i) - 32);
            }

        }
            System.out.println(s);
            System.out.println(s2);

    }
}
