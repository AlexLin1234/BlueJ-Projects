import java.util.*;
import java.io.*;
/**
 * The number of unique words in Horatius is calculated here. 
 *
 * @author Alexander Lin
 * @version 20190103
 */
public class UniqueWords {

    public int getUnique(){
        
        
        String [] tempArray;
        ArrayList<String> newWords = new ArrayList<String>();
        List<String> newList;
        
        ArrayList<String> words = new ArrayList<String>();
        try{
            Scanner in = new Scanner(new File("Lars Porsena.txt"));
            while(in.hasNextLine()){
                
                tempArray = in.nextLine().trim().split(" +");
                newList = Arrays.asList(tempArray);

                words.addAll(newList);

            }
            

        }   

        catch(IOException i){
            System.out.println("Error: " + i.getMessage());
        }
        String uniqueWord;
        
        for (int i = 0; i <= words.size()-1; i++)
        {
            uniqueWord = words.get(i);
            uniqueWord = uniqueWord.toLowerCase();
            uniqueWord = uniqueWord.replace(" ","");
            words.set(i,uniqueWord.replace(" ",""));

        }
        for (int i = 0; i <= words.size()-1; i++)
        {
            uniqueWord = words.get(i);
            words.remove(i);
            if(!(newWords.contains(uniqueWord))){
                newWords.add(uniqueWord);

            }
            
        }
        System.out.println("# of unique words: " + newWords.size());
        return  newWords.size();

    }
    }