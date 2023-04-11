package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        // Split the string into an array of words
        String[] words = st.split(" ");


        Map<String, Integer> wordCounts = new HashMap<>();

       //Loop through the words and update the count of occurrences
        for (String word : words) {
            if (wordCounts.containsKey(word)) {
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                wordCounts.put(word, 1);
            }
        }


        System.out.println("Duplicate words and their number of occurrences:");
        for (String word : wordCounts.keySet()) {
            int count = wordCounts.get(word);
            if (count > 1) {
                System.out.println(word + " : " + count);
            }
        }


        int totalLength = 0;
        for (String word : words) {
            totalLength += word.length();
        }
        double avgLength = (double) totalLength / words.length;


        System.out.println("Average length of the words: " + avgLength);
    }

}
