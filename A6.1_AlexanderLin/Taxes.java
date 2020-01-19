
/**
 * Calculates a person's profits from his job before tax and after tax.
 *
 * @author Alexander Lin
 * @version 20180908
 */
public class Taxes
{
    
    private double myHoursWorked;
    private double myHourlyRate;

    /**
     * Constructor for objects of class Taxes
     */
    
    public Taxes(double hoursWorked, double hourlyRate)
    {
        myHoursWorked = hoursWorked;
        myHourlyRate = hourlyRate;
    }
    //simple getters of variables
    public double getHours(){
        return myHoursWorked;
        
    }
    public double getRate(){
        return myHourlyRate;
    }
    //calculations begin here
    public double grossPay(){
        return myHoursWorked * myHourlyRate;
    }
    public double federalTax(){
        return grossPay() * 0.154;
    
    }
    public double FICATax(){
        return grossPay() * 0.0775;
    
    }
    public double stateTax(){
        return grossPay() * 0.04;
    }
    public double netPay(){
        return grossPay() - federalTax() - FICATax() - stateTax();
    }


}
