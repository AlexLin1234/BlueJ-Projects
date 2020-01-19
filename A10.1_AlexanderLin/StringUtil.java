import java.util.Collections;
import java.util.Arrays;
/**
 * StringUtil contains String manipulation functions like reserse and shorthand. They use the String class functions, loops, and recursion. 
 *
 * @author Alexander Lin
 * @version 20180108
 */
public class StringUtil
{

    public static String reverse(String s){
        String new_s = new String();
        int size = s.length();
        for(int i = size - 1;i>=0;i--){
            new_s += s.charAt(i);

        }

        return new_s;
    }

    public static String reverseViaRecursion(String s) {

        //What is base case?
        if(s.isEmpty() ){
            return s;
        } else {
            return reverseViaRecursion(s.substring(1)) + s.charAt(0);
        }
    }

    private static String cleanString(String s){

        //s.trim();

        String new_s = new String();
        int size = s.length();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        new_s = s.replaceAll("[^A-Za-z]+", "").toLowerCase();
        /**
        for(int i = 0;i<=size-1;i++){
        char c = s.charAt(i);
        if(alphabet.indexOf(c) != -1){
        new_s += c;
        System.out.println(c);
        }
        }
         **/

        return new_s;

    }



    public static Boolean isPalindrome(String s){
        String input = cleanString(s);
        //return isPalindromeHelper(input);
        return input.equals(reverse(input));

    }
    private static final char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    

    public static String shortHand(String s){
        String temp_string = s;
        String new_s = new String();
        temp_string=s.replace("\\band\\b", "&");
        temp_string=s.replace("\\bto\\b", "2");
        temp_string=s.replace("\\byou\\b","U");
        temp_string=s.replace("\\bfor\\b", "4");
        temp_string=s.replace("\\bAnd\\b", "&");
        temp_string=s.replace("\\bTo\\b", "2");
        temp_string=s.replace("\\bYou\\b","U");
        temp_string=s.replace("\\bFor\\b", "4");
        int size = temp_string.length();
        for (int i = 0;i<=size-1;i++){
            char c = temp_string.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A'|| c == 'E'||c == 'I'|| c == 'O'|| c == 'U')
            {

            }
            else{
                new_s += c;
            }

        }
        return new_s;
    }
}