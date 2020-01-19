
/**
 * PigLatin is a separate class that takes an input and returns the pig-latin version of that input
 *
 * @author Alexander Lin
 * @version 20190113
 */
import java.io.*;

/**
 * Translates a sentence into pig latin.
 */
public class PigLatinTranslator {

    /** To use for input. */
    private static BufferedReader buf = new BufferedReader(
            new InputStreamReader(System.in));

    /** Main method */
    public static void main(String[] args) throws IOException {

        // Get a string
        System.out.print("Enter sentence: ");
        String english = getString();

        // Translate and print back out
        String latin = pigLatin(english);
        System.out.println(latin);
    }

    /**
     * Method to translate a sentence word by word.
     * @param s The sentence in English
     * @return The pig latin version
     */
    private static String pigLatin(String s) {
        String latin = "";
        int i = 0;
        while (i<s.length()) {

            // Take care of punctuation and spaces
            while (i<s.length() && !isLetter(s.charAt(i))) {
                latin = latin + s.charAt(i);
                i++;
            }

            // If there aren't any words left, stop.
            if (i>=s.length()) break;

            // Otherwise we're at the beginning of a word.
            int begin = i;
            while (i<s.length() && isLetter(s.charAt(i))) {
                i++;
            }

            // Now we're at the end of a word, so translate it.
            int end = i;
            latin = latin + pigWord(s.substring(begin, end));
        }
        return latin;
    }

    /**
     * Function that translates each word into pig-latin.
     * Takes word The word in english
     * returns The pig latin version
     */
    private static String pigWord(String word) {
        int split = firstVowel(word);
        return word.substring(split)+"-"+word.substring(0, split)+"ay";
    }

    /**
     * Method to test whether a character is a letter or not.
     * Takes c The character to test
     * returns True if it's a letter
     */
    private static boolean isLetter(char c) {
        return ( (c >='A' && c <='Z') || (c >='a' && c <='z') );
    }


    /**
     * Method to find the index of the first vowel in a word.
     * @param word The word to search
     * @return The index of the first vowel
     */
    private static int firstVowel(String word) {
        word = word.toLowerCase();
        for (int i=0; i<word.length(); i++)
            if (word.charAt(i)=='a' || word.charAt(i)=='e' ||
            word.charAt(i)=='i' || word.charAt(i)=='o' ||
            word.charAt(i)=='u')
                return i;
        return 0;
    }

    /**
     * Helper method to get input.
     * returns A String from stdout
     */
    private static String getString() throws IOException {
        return buf.readLine();
    }
}