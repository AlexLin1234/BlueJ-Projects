
/**
 * This class describes the attributes and methods to simulate a car. 
 *
 * @author Alexander Lin
 * @version 20180827
 */
public class Car
{
    // instance variables - replace the example below with your own
    public int myStartMiles;
    public int myEndMiles;
    public double myGallonsUsed;
    

    /**
     * Constructor for objects of class Car
     */
    public Car(int x)
    {
        int odometerReading = x;
        myStartMiles = odometerReading;
       
    }
    public void fillUp(int y, double gallons){
        myEndMiles = y;
        myGallonsUsed = gallons;
        
    }
    public double calculateMPG(){
        int x = myStartMiles;
        int y = myEndMiles;
        double gallons = myGallonsUsed;
        
        return (y-x)/gallons;
    
    }
    public void resetMPG(){
        myStartMiles = myEndMiles;
        myGallonsUsed = 0;
    }

    
}
