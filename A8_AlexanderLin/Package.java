import java.util.Scanner;
/**
 * Takes the dimensions of a certain package and calculates whether the package is ok, too large, too heavy, or both
 *
 * @author Alexander Lin
 * @version 20180919
 */
public class Package
{
    
    

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first dimension: ");
        int dim1 = sc.nextInt();
        System.out.println("Enter the second dimension: ");
        int dim2 = sc.nextInt();
        System.out.println("Enter the third dimension: ");
        int dim3 = sc.nextInt();
        System.out.println("Enter weight: ");
        int weight = sc.nextInt();
        
        if(dim2 > dim1){
            int temp = dim1;
            dim1 = dim2;
            dim2 = temp;
        }
        if(dim3 > dim1){
            int temp_3 = dim1;
            dim1 = dim3;
            dim3 = temp_3;
        }
        int girth = dim2 * dim3;
        if(girth > 100){
            if(weight >70){
                System.out.println("This package is too large and heavy.");
                return;
            }
            System.out.println("This package is too large");
            return;
            
            
        }
        else{
            if(weight > 70){
                System.out.println("This package is too heavy");
                return;
            }
            System.out.println("This package is acceptable");
            return;
        }
        
    }
}
