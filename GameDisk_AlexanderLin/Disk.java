import java.util.ArrayList;
import java.lang.Math;
/**
 * Disk provides the information for the properties and commands of all Disks in the program. 
 *
 * Alexander Lin
 * 20181206
 */



public class Disk
{
    int currentValue;
    int num = (int)(Math.random() * 8 + 1);
    public Disk()
    {
        currentValue = 0;
    }
    
    public int getValue()
    {
        return currentValue;
    }
    
    public void setValue(int n)
    {
        currentValue = n;
    }
    
    public void spin()
    {
        currentValue = num;
    }
    
    public String toString()
    {
        return "Disk Number Value " + currentValue;
    }
}
