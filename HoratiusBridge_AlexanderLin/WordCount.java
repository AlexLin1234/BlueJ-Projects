
/**
 * The word count, the character count, the line count of Horatius is calculated here. 
 *
 * @author Alexander Lin
 * @version 20190103
 */
import java.util.Scanner;
import java.io.*;

public class WordCount {
    public static void main(String[] args) throws IOException {
    //counters
        int lines = 0;
        int characters = 0;
        int words = 0;
        

        Scanner in = null;
        File file = new File("Lars Porsena.txt");

        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)))){

            while (scanner.hasNextLine()) {

                String tmpStr = scanner.nextLine();
                if (!tmpStr.equalsIgnoreCase("")) {
                    String replaceAll = tmpStr.replaceAll("\\s+", "");
                    characters += replaceAll.length();
                    words += tmpStr.split("\\s+").length;
                }
                ++lines;
            }

        System.out.println("# of chars: " + characters);
        System.out.println("# of words: " + words);
        System.out.println("# of lines: " + lines);
        System.out.println("# of bytes: " + file.length());

        }
    }
}