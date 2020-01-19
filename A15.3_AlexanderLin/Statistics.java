import java.util.ArrayList;
import java.util.List;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.*;
import java.util.Collections;
import java.lang.*;
import java.text.DecimalFormat;
/**
 * Finds the average, mode, and standard deviation of a set of numbers in a txt file. Also keeps all output values 
 * under 2 decimal places. 
 *
 * @author Alexander Lin
 * @version 20190128
 */
public class Statistics
{

    public static void main(String[] args) throws FileNotFoundException {    
        Scanner scanner = new Scanner(new File("numbers.txt"));
        ArrayList<Double> num = new ArrayList<Double>();
        int i = 0;
        while(scanner.hasNextInt()){
            num.add((double)scanner.nextInt());
        }
        double average = 0;
        double sum = 0;
        for(i = 0; i < num.size(); i++){
            sum += num.get(i);}
        average = sum/num.size();
        double standardDev = 0;
        for(int j = 0;j<num.size();j++){
            standardDev += Math.pow(num.get(j)-average,2);
        
        }
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        standardDev = standardDev/(num.size()-1);
        standardDev = Math.sqrt(standardDev);
        System.out.println("Average of the set is: " + numberFormat.format(average));
        System.out.println("Standard Deviation of the set is: " + numberFormat.format(standardDev));
        System.out.println("Mode of the set is: " + numberFormat.format(mode(num)));
        

    }

    private static double mode(ArrayList<Double> a) {
        double mode = a.get(0);
        int maxCount = 0;
        for (int i = 0; i < a.size(); i++) {
            double value = a.get(i);
            int count = 1;
            for (int j = 0; j < a.size(); j++) {
                if (a.get(j) == value)
                    count++;
                if (count > maxCount) {
                    mode = value;
                    maxCount = count;
                }
            }
        }
        return mode;
    }
}

