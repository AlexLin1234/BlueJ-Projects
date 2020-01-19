
/**
 * Word carries the properties of a word and also implements the Comparable interface.
 *
 * @author Alexander Lin
 * @version 20190307
 */

import java.util.ArrayList;

public class Word implements Comparable<Word>
{
    String word = "";
    String definition = "";
    ArrayList<String> definitions = new ArrayList<String>();
    
    public Word(String word, String def)
    {
        this.word = word;
        this.definition = def;
        definitions.add(def);
    }

    public String getWord(){
        return word;
    }
    //You may wish to create other methods so as to return results
    public String getDefinition(){
        return definition;
    }
    
    public ArrayList<String> getAllDefinitions(){
        return definitions;
    }
    
    public void addDefinition(String def) {
        definitions.add(def);
    }
    
    public String toString() {
        return word + ": " + definition;
    }
    
    //required for Collections.sort
    public int compareTo(Word w) {
        //Compare the word itself (a string) using 
        //String class compareTo method. This will sort
        //the word objects as if they are Strings
        //when a Collections.sort or other sort method
        //is called.
        
        return this.word.compareTo(w.getWord());
    }
}
