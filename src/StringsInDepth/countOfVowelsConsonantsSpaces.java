package StringsInDepth;

public class countOfVowelsConsonantsSpaces {
    public static void main(String[] args) {
        String s = "Hello World";
        int countOfVowels = 0, countOfConsonants = 0, countOfSpaces = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'){
                countOfVowels++;
            } else if (s.charAt(i) == ' ') {
                countOfSpaces++;
            }else{
                countOfConsonants++;
            }
        }
        System.out.println("Vowels: " + countOfVowels);
        System.out.println("Consonants: " + countOfConsonants);
        System.out.println("Spaces: " + countOfSpaces);
    }
}
