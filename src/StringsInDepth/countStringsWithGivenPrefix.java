package StringsInDepth;

public class countStringsWithGivenPrefix {
    public static void main(String[] args) {
        String[] strArr = {"pay", "attention", "practice", "attend"};
        String pref = "at";
        int countOfMatchPrefix = 0;
        for(String i : strArr){
            if(i.startsWith(pref)) {
                countOfMatchPrefix++;
            }
        }
            System.out.println(countOfMatchPrefix);

    }
}
