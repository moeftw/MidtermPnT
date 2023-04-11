package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";


        Map<Integer, String> wordNLength = findTheLargestWord(s);


        int maxLength = wordNLength.keySet().iterator().next();
        String longestWord = wordNLength.get(maxLength);


        System.out.println(longestWord + " " + maxLength);
    }

    public static Map<Integer, String> findTheLargestWord(String sentence){

        Map<Integer, String> wordNLength = new HashMap<Integer, String>();

        String[] words = sentence.split(" ");


        int maxLength = words[0].length();
        String longestWord = words[0];

        // Loop through the remaining words and compare their lengths with maxLength
        for (int i = 1; i < words.length; i++) {

            int length = words[i].length();

            // If the length of the current word is greater than maxLength, update maxLength and longestWord
            if (length > maxLength) {
                maxLength = length;
                longestWord = words[i];
            }
        }

        // Add the longest word and its length to the Map
        wordNLength.put(maxLength, longestWord);

        // Return the Map
        return wordNLength;
    }
}
