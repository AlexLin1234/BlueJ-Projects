import java.util.ArrayList;
import java.io.*;
import java.util.List;
/**
 * The class provides a few array commands that are not present in Arrays but are present in ArrayLists. 
 * @author Alexander Lin
 * @version 20190105
 */
public class ArrayFunctions
{
    /**
     * Returns an int array that has a value inserted into a position, shifting all further positions up. 
     *
     * @param  arr  the original array to be inserted
     * @return      an array containing the original arary with a value inserted
     */
    public static  int[] Insertion(int[] input, int newValue, int position){
        int[] output = new int[input.length + 1];
        boolean hitNum = false;
        int j = 0;
        for(int i = 0;i<input.length;i++){

            if(i==position){
                output[i] = newValue;
                j = input[i];
                hitNum = true;

            }
            else{ 

                if(hitNum == false){
                    output[i] = input[i];
                }
                else{
                    output[i] = j;
                    j = input[i];
                    output[i+1] = j;
                }
            }
        }
        return output;

    }

    /**
     * Returns an int array that has a value deleted from a position, shifting all further positions down. 
     *
     * @param  arr  the original array
     * @return      an array containing the original arary with a value deleted
     */
    public static int[] Deletion (int[] input, int position){
        int[] output = new int[input.length - 1];
        boolean hitPos = false;
        for(int i = 0;i<output.length;i++){
            if(i == position){
                hitPos = true;
                output[i] = input[i+1];

            }
            else{
                if(hitPos == true){
                    output[i] = input[i+1];

                }
                else{
                    output[i] = input[i];
                }
            }

        }
        return output;

    }

    /**
     * Returns an int that shows the first index in which a value is found in an array. If value is not found, then 
     * -1 is returned. 
     *
     * @param  arr  the original array and a number to look for
     * @return      an int for the first index at which the number is found in the array. 
     */
    public static int Traversal(int[] input, int num){
        int index= 0;
        boolean foundNum = false;
        for(int i = 0;i<input.length;i++){
            if(input[i] == num){
                foundNum = true;
                index = i;
            }

        }
        if(foundNum){
            return index;

        }
        else{
            return -1;
        }

    }

    /**
     * Returns an int that shows all the index values in which a specified value is found in an array. 
     *
     * @param  arr  the original array to be traversed, and a number to look for
     * @return      an array of indexes in which the numbers are the indexes of the original array which contain
     * the specified value. 
     */
    public static int[] TraversalAll(int[] input, int num){
        List<Integer> output = new ArrayList<Integer>();
        for(int i = 0;i<=input.length-1;i++){
            if(input[i]==num){
                output.add(i);

            }

        }
        int objects[] = new int[output.size()];
        for(int i = 0;i<=objects.length-1;i++){
            objects[i] = output.get(i);
        }
        return objects;

    }
}
