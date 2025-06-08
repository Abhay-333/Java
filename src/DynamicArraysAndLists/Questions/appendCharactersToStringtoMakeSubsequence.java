package DynamicArraysAndLists.Questions;

public class appendCharactersToStringtoMakeSubsequence {

    public static int bruteForce(String s, String t) {
        //Time Complexity: O(n+m)
        //Space Complexity: O(1)
        int i = 0, j = 0;

        while(i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else{
                i++;
            }
        }

        return t.length()-j;
    }

    public static void main(String[] args) {
//        System.out.println(bruteForce("coaching", "coding"));
//        System.out.println(bruteForce("abcde", "a"));
        System.out.println(bruteForce("z", "abcde"));
    }

}
