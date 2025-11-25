package BackTracking.Level2;

import java.util.ArrayList;
import java.util.List;

public class SubsetsInStrings {
    public static List<String> backtracking(String str, int i, String currentSet, List<String> ans) {
        if (i == str.length()) {
            ans.add(currentSet);
            return ans;
        }
        //choose
        backtracking(str, i+1, currentSet + str.charAt(i), ans);

        //not choose
        return backtracking(str, i+1, currentSet, ans);
    }

    public static void main(String[] args) {
        String str = "abcd";
        List<String> ans = new ArrayList<>();
        System.out.println(backtracking(str, 0, "", ans));
    }
}