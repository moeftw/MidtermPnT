package string.problems;
import java.util.Arrays;
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String string1 = "CAT";
        String string2 = "ACT";

        boolean areAnagrams = areStringsAnagrams(string1, string2);

        if (areAnagrams) {
            System.out.println(string1 + " and " + string2 + " are anagrams.");
        } else {
            System.out.println(string1 + " and " + string2 + " are not anagrams.");
        }
    }

    private static boolean areStringsAnagrams(String string1, String string2) {

        string1 = string1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        string2 = string2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        char[] str1Array = string1.toCharArray();
        char[] str2Array = string2.toCharArray();
        Arrays.sort(str1Array);
        Arrays.sort(str2Array);

        return Arrays.equals(str1Array, str2Array);
    }
}
