import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 * The program calculates the total costs of a grocery list based on input and also compares that with a sample list
 * that is read from a text file. 
 *
 * @author Alexander Lin
 * @version 20180911
 */
public class GroceryList
{
    public static void main(String[] args) throws IOException{
        
        double runningTotal  = 0.0;
        
        Scanner sc = new Scanner(System.in);
        double price[] = new double[5];
        for (int i = 1;i<=5;i++){
            System.out.print("Enter item #" + i + ": ");
            price[i-1] = sc.nextDouble();
            runningTotal += price[i-1];
            
            //System.out.printf("%9d %10.2f %10s \n", i, price[i-1], runningTotal);
            
        
        }
        System.out.printf("%10s %10s %10s \n", "Item: ", "Cost: ", "Total: ");
        //numbers
        
        System.out.printf("%9s %10.2f %10s \n", "1", price[0], price[0]);
        System.out.printf("%9s %10.2f %10s \n", "2", price[1], price[0] + price[1]);
        System.out.printf("%9s %10.2f %10s \n", "3", price[2], price[0] + price[1] + price[2]);
        System.out.printf("%9s %10.2f %10s \n", "4", price[3], price[0] + price[1] + price[2] + price[3]);
        System.out.printf("%9s %10.2f %10.2f \n", "5", price[4], price[0] + price[1] + price[2] + price[3] + price[4]);
        
        
        System.out.printf("Sample List: \n");
        readUsingNIO(price[0] + price[1] + price[2] + price[3] + price[4]);
        
        
    }
    
    private static void readUsingNIO(double inputTotal) throws IOException{
        Path path = Paths.get("GroceryList.txt");
        try (BufferedReader bufferedReader = Files.newBufferedReader(path)){
            double value;
            double total = 0.0;
            String line;
            int i = 0;
            while ((line = bufferedReader.readLine()) != null) {
                i++;
                value = Double.parseDouble(line);
                total += value;
                System.out.printf("%10s %10s %10s \n", "Item: ", "Cost: ", "Total: ");
                System.out.printf("%9d %10.2f %10s \n", i, value, total);
                
                
            
            }
            if(total == inputTotal){
                System.out.printf("%s %f %s %f %s", "The value of the input total, ",
                inputTotal, "and the sample total", total, "are the same");
                
            
            
        
        }
        else{
             System.out.printf("%s %f %s %f %s", "The value of the input total, ",
                inputTotal, "and the sample total", total, "are not the same");
        }
        
    }
    
}
}   
