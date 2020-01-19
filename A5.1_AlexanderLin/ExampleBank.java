
/**
 * A program used to test the functionality of PiggyBank
 *
 * @author Alexander Lin
 * @version 20180904
 */
public class ExampleBank
{
    // instance variables - replace the example below with your own
    private static PiggyBank bank1 = new PiggyBank();
    private static PiggyBank bank2 = new PiggyBank(1,4,4,9);
    public static void main (String [] args){
        System.out.println("number of pennies: " + bank2.getPennies());
        System.out.println("number of nickels: " + bank2.getNickels());
        System.out.println("number of dimes: " + bank2.getDimes());
        System.out.println("number of quarters: " + bank2.getQuarters());
        
        bank2.deposit(1,1,1,1);
        System.out.println("deposited 1 of each coin");
        System.out.println("total value:  " + bank2.totalValue());
        
        
        
    
    
    }
}
