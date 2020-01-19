import java.util.Scanner;
/**
 * IRS takes your marriage status and your income and calculates your total tax based on what tax bracket you are in. 
 *
 * @author Alexander Lin
 * @version 20180920
 */
public class IRS
{
   public static double fedTax(boolean isMarried, int income){
    
    if(isMarried){
        if(income > 0){
                
                if(income <=45200){
                    return 0.15*(double)income;
            }
                else if(income <=109250){
                    return 6780 + (0.275*(double)(income - 45200));
                }
                else if(income <=166500){
                    return 24393.75 + (0.305*(double)(income - 109250));
                }
                else if(income <=297350){
                    return 41855 + (0.355*(double)(income -166500));
                }
                else{
                    return 88306 + (0.391 * (double)(income - 297350));
                }
                
            }
    
    }
    else{
        if(income > 0){
            
            if(income <=27050){
                return 0.15*(double)income;
        }
            else if(income <=65550){
                return 4057.5 + (0.275*(double)(income - 27050));
            }
            else if(income <=136750){
                return 14645 + (0.305*(double)(income - 65550));
            }
            else if(income <=297350){
                return 36361 + (0.355*(double)(income - 136750));
            }
            else{
                return 93374 + (0.391 * (double)(income - 297350));
            }
            
        }
        
    
    
    }
    return 0;
    } 
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter marital status: 1 for Single and 2 for Married");
    int marriage = sc.nextInt();
    System.out.println("Enter taxable income:");
    System.out.print("$ ");
    int income = sc.nextInt();
    System.out.println("Your federal tax");
    if(marriage == 1){
        System.out.println(fedTax(false, income));
        
    }
    else if(marriage == 2){
        System.out.println(fedTax(true,income));
    }
    
}

    
}
