
/**
 * Tests the Taxes class and the methods inside the class
 *
 * @author Alexander Lin
 * @version 20180908
 */
public class ExampleTaxes
{
    private static Taxes person = new Taxes(30, 12.35);
    public static void main (String [] args){
        System.out.println("Hours worked: " + person.getHours());
        System.out.println("Hourly rate: " + person.getRate());
        System.out.println("Gross pay: " + person.grossPay());
        System.out.println("Federal tax(15.4%): " + person.federalTax());
        System.out.println("FICA tax(7.75%): " + person.FICATax());
        System.out.println("State tax(4.0%): " + person.stateTax());
        System.out.println("Net pay: " + person.netPay());
        
    }
    
}
