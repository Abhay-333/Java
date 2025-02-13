package StringsInDepth;

import java.util.Arrays;

public class maximumNumberofWordsinSentence {
    public static void main(String[] args) {
        String[] sentences = {"coding is fun", "consistency is the key to success", "practice makes perfect"};
        // we have to find maximum number of words is a sentence
        int counter = 0, maxOfCounter = 0;      // maxOfCounter created to store the maximum value of counter
        // and then afterwards we use it to compare the value of maxOfCounter and counter

        for (String sentence : sentences) {
            counter = 0;
            String[] words = sentence.split(" ");

            for (String word : words) {
                counter++;
            }

            maxOfCounter = Math.max(maxOfCounter, counter);
        }

        System.out.println(maxOfCounter);
    }
}
