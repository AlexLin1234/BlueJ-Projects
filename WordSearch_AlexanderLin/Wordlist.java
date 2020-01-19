
/**
 *  WordList carries out the sorting and the processing of the words in the list. Also provides the menu and the sorting.
 *
 * @author Alexander Lin
 * @version 20190307
 */

import java.util.Scanner;
import java.io.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Wordlist
{
    private static ArrayList<Word> wordlist = new ArrayList<Word>();
    private static int num_lines = 0;

    /*
     * Having difficulty with "Sere (a.) [OE. seer, AS. sear (assumed) fr. searian to wither; akin to D. zoor dry, LG. soor, OHG. sor/n to to wither, Gr. a"y`ein to parch, to dry, Skr. /ush (for sush) to dry, to wither, Zend hush to dry. √152. Cf. Austere, Sorrel, a.] Dry; withered; no longer green; -- applied to leaves."
     * Output would continually bonk at "Skr. /ush". 
     * http://www.java67.com/2016/06/5-difference-between-bufferedreader-and-scanner-in-java.html?m=1
     * 
     * BufferedReader can process more data per line as a 'string'
     * Scanner reads Regex. This may be possibly an issue(?) with seeing /u
     */
    public static void importCSVbr(String filename)
    {
        String line = "";

        try {
            File this_file = new File(filename);
            //S: Scanner in = new Scanner(this_file);
            //B:
            BufferedReader br = new BufferedReader(new FileReader(this_file));
            String sCurrentLine;
            while((sCurrentLine = br.readLine()) != null){
                //S: while(in.hasNextLine()) {
                //S: line = in.nextLine();
                //S: line = in.nextLine().replaceAll("[[\"\\/]]","");
                //B: 
                line = sCurrentLine.replaceAll("[\"\\/]","");
                //Diagnostic
                //System.out.println(line);
                if(line.length() > 0){
                    num_lines++;
                    Boolean wordadded = false;
                    if(line.indexOf("(") > 0 && line.indexOf(")") > 0){
                        Word w = new Word(
                                line.substring(0,line.indexOf("(")).trim().toLowerCase(), 
                                line.substring(line.indexOf(")")).replaceAll("[)\"(]",""));

                        //Check if word is in list already
                        boolean def_added = false;
                        for(Word e: wordlist){//slow, sequential search for match.
                            if(e.getWord().equals(w.getWord())) {
                                e.addDefinition(w.getDefinition());
                                def_added = true;

                            }
                        }

                        if(def_added == false) {
                            wordlist.add(w);
                            //Diagnostic
                            //System.out.println(w);
                        }
                        wordadded = true;
                    }

                    if(!wordadded) {

                        //System.out.println("skipped: " + line);
                        //System.out.println(line.indexOf("(") + " " + line.indexOf(")"));
                        //System.out.println(line);
                    }
                }  
            }
            //B: 
            br.close();
            //S: in.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    public static void importCSV(String filename)
    {
        String line = "";

        try {
            File this_file = new File(filename);
            Scanner in = new Scanner(this_file,"UTF-8");
            while(in.hasNextLine()) {
                //line = in.nextLine();
                line = in.nextLine().replaceAll("[[\"\\/]]","");
                //Diagnostic
                //System.out.println(line);
                if(line.length() > 0){
                    num_lines++;
                    Boolean wordadded = false;
                    if(line.indexOf("(") > 0 && line.indexOf(")") > 0){
                        Word w = new Word(
                                line.substring(0,line.indexOf("(")).trim().toLowerCase(), 
                                line.substring(line.indexOf(")")).replaceAll("[)\"(]",""));
                        wordlist.add(w);
                        //Diagnostic
                        //System.out.println(w);
                        wordadded = true;
                    }

                    if(!wordadded) {
                        //System.out.println("skipped: " + line);
                        //System.out.println(line.indexOf("(") + " " + line.indexOf(")"));
                        //System.out.println(line);
                    }
                }  
            }
            in.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    public static void searchResult(String input) {
        System.out.println("Word to find: " + input);
        int definition_count = 0;
        boolean word_found = false;
        //Sequential Search
        for(Word w : wordlist) {
            if(input.toLowerCase().compareTo(w.getWord().toLowerCase()) == 0){
                //System.out.println(w.getWord().toLowerCase());
                definition_count++;
                System.out.println("Definition " + definition_count + ": " + w.getDefinition());
                word_found = true;
            }

        }

        if(!word_found) {
            System.out.println(input + " is NOT in the dictionary.");
        }

        return;
    }

    public static void printWordList(){
        for(Word w: wordlist) {
            System.out.println(w.getWord());
        }
    }

    public static void menu(){

        //Create a "menu" that allows a user to either Search or do a Binary Search for a word

        System.out.println("Starting with sequential analysis of data:");

        Scanner in = new Scanner(System.in);
        boolean run_program = true;
        while(run_program) {
            System.out.print("Enter a word to see if it is in the dictionary ('q' to exit)(: ");
            String input = in.nextLine();
            if(!input.equals("q")) {
                searchResult(input);
            } else {
                run_program = false;
            }
        }

        //Create a program the uses Binary Search to find a word in the list. The list will need to be
        //sorted first for this to work. Use any sort approach you like, as long as it is NOT
        //a built-in sort function, such as Collections.sort.  You are to do the work.

        //Start by sorting list
        run_program = true;
        Collections.sort(wordlist);
        System.out.println("Data has been sorted already. You may now begin Binary Search of data");
        run_program = true;
        while(run_program) {
            System.out.print("Enter a word to see if it is in the dictionary ('q' to exit)(: ");
            String input = in.nextLine();

            if(!input.equals("q")) {
                
                    Word result = binarySearch(0, wordlist.size()/2, wordlist.size(), input);
                    System.out.println("Returned result: " + result);
                    System.out.println("All Definitions of " + result.getWord());
                    for(String s: result.getAllDefinitions()){
                        System.out.println(s);
                    }
                
            }else {
                run_program = false;
            }
        }
        //System.out.println("Trying binary search for Syzygy");

        //printWordList();

        System.out.println("Goodbye");
        in.close();

    }

    public static Word binarySearch(int start, int midpoint, int end,  String input){
        input = input.toLowerCase();

        if(start == end){
            Word w_null = new Word("null","null");
            return w_null;
        }

        Word w_mid = wordlist.get(midpoint);
        if(w_mid.getWord().equals(input)){
            return w_mid;
        } else if(input.compareTo(w_mid.getWord()) < 0){ //midpoint is to the left of word
            return binarySearch(start, midpoint/2, midpoint,  input);
        } else { //midpoint is to the right of word
            return binarySearch(midpoint, midpoint + (end-midpoint)/2, end,  input);
        }

    }
    public static void importData(char letter_ascii_value) {
        //Read in 26 files into a list of Word objects.
        //Diagnostic for letter 's' 
        //for(int i = 0; i < 26; i++) {

        //for(int i = 24; i < 26; i++) {
        //char letter_ascii_value = (char) (65 + i);
        String filename = letter_ascii_value + ".csv";
        importCSVbr(filename);
        //System.out.println("Filename: " + filename);
        // }

        System.out.println("Words in list: " + wordlist.size());
        System.out.println("Number of lines in file: " + num_lines);

    }

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        char input;
        System.out.println("which letter is the word you're searching for?");
        input = sc.nextLine().charAt(0);

        importData(input);
        menu();

    }
}
