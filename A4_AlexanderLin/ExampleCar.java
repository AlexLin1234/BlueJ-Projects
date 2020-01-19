
/**
 * This class creates Car objects and tests their methods. 
 *
 * @author Alexander Lin
 * @version 20180827
 */
public class ExampleCar
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class ExampleCar
     */
    public ExampleCar()
    {
      
      
    }
    public static void main (String[] args){
        Car auto = new Car(15);
        System.out.println("New car odometer reading: " + auto.myStartMiles);
        auto.fillUp(150,8);
        System.out.println("Miles per gallon: " + auto.calculateMPG());
        System.out.println("Miles per gallon: " + auto.calculateMPG());
        auto.resetMPG();
        auto.fillUp(350, 10);
        auto.fillUp(450, 20);
        System.out.println("Miles per gallon: " + auto.calculateMPG());
        auto.resetMPG();
        auto.fillUp(603, 25.5);
        System.out.println("Miles per gallon: " + auto.calculateMPG());
    }

   
}
