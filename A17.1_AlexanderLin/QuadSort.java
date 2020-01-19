import java.util.ArrayList;

/**
 * QuadSort class has the bubbleSort, selectionSort, insertionSort, and makes a table on how many steps each takes
 * to sort an array of 100, 200, 400, and 800 random integers.
 * 
 * Now includes MergeSort as well.
 *
 * @author Alexander Lin
 * @version 20190220
 */
public class QuadSort
{
    
    private static int count;
    
    public QuadSort()
    {

    }

    
    

    static void bubbleSort(ArrayList<Integer> list){
        count = 0;
        for(int outer = 0;outer<list.size()-1;outer++){

            for(int inner = 0;inner<list.size()-outer-1;inner++){
                count += 3;
                if(list.get(inner) > list.get(inner + 1)){
                    count += 4;
                    int temp = list.get(inner);
                    list.set(inner, list.get(inner + 1));
                    list.set(inner + 1, temp);

                }

            }
        }

    }

    static void selectionSort(ArrayList<Integer> list){
        count = 0;
        int min, temp;
        for(int outer = 0;outer < list.size()-1;outer++){
            min = outer;
            count++;
            for(int inner = outer + 1;inner< list.size();inner++){
                count++;
                if(list.get(inner) < list.get(min)){
                    count++;
                    min = inner;
                }

            }
            //swap list[outer] and list[min]
            temp = list.get(outer);
            list.set(outer, list.get(min));
            list.set(min, temp);
            count += 4;

        }
    }

    static void insertionSort(ArrayList<Integer> list){
        count = 0;
        for(int outer = 1;outer < list.size();outer++){
            int position = outer;
            int key = list.get(position);
            count+=2;

            //shift larger values to the right
            while(position > 0 && list.get(position-1) > key){
                count++;
                list.set(position, list.get(position - 1));
                count++;
                position--;

            }
            list.set(position, key);
            count++;

        }

    }

    public static void main(String[] args){
        ArrayList<Integer> firstArray = new ArrayList<Integer>();
        ArrayList<Integer> secondArray = new ArrayList<Integer>();
        ArrayList<Integer> thirdArray = new ArrayList<Integer>();
        ArrayList<Integer> fourthArray = new ArrayList<Integer>();
        for(int i = 0;i<100;i++){
            firstArray.add((int)((Math.random()*99)+1));

        }
        for(int j = 0;j<200;j++){
            secondArray.add((int)((Math.random()*99)+1));

        }
        for(int k = 0;k<400;k++){
            thirdArray.add((int)((Math.random()*99)+1));

        }
        for(int l = 0;l<800;l++){
            fourthArray.add((int)((Math.random()*99)+1));

        }

        bubbleSort(firstArray);
        int stepsOne = count;

        bubbleSort(secondArray);
        int stepsTwo = count;

        bubbleSort(thirdArray);
        int stepsThree = count;

        bubbleSort(fourthArray);
        int stepsFour = count;

        System.out.format("%16s%16s%16s%16s\n", "", "100 Integers", "200 Integers", "400 Integers", "800 Integers");
        System.out.format("%16s%16d%16d%16d\n", "BubbleSort", stepsOne, stepsTwo, stepsThree, stepsFour);

        selectionSort(firstArray);
        stepsOne = count;
        selectionSort(secondArray);
        stepsTwo = count;
        selectionSort(thirdArray);
        stepsThree = count;
        selectionSort(fourthArray);
        stepsFour = count;
        System.out.format("%16s%16d%16d%16d\n", "SelectionSort", stepsOne, stepsTwo, stepsThree, stepsFour);

        insertionSort(firstArray);
        stepsOne = count;
        insertionSort(secondArray);
        stepsTwo = count;
        insertionSort(thirdArray);
        stepsThree = count;
        insertionSort(fourthArray);
        stepsFour = count;
        System.out.format("%16s%16d%16d%16d\n", "InsertionSort", stepsOne, stepsTwo, stepsThree, stepsFour);
        
        MergeSort ob = new MergeSort(); 
        ob.sort(firstArray, 0, firstArray.size()-1); 
        stepsOne = ob.count();
        ob.sort(secondArray, 0, secondArray.size()-1); 
        stepsTwo = ob.count();
        ob.sort(thirdArray, 0, thirdArray.size()-1); 
        stepsThree = ob.count();
        ob.sort(fourthArray, 0, fourthArray.size()-1); 
        stepsFour = ob.count();
        
        
        
        System.out.format("%16s%16d%16d%16d\n", "MergeSort", stepsOne, stepsTwo, stepsThree, stepsFour);

    }
}
