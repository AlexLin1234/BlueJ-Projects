
/**
 * Test class used to test IrregularPolygon
 *
 * @author Alexander Lin
 * @version 20190125
 */
import java.awt.geom.*;
import java.util.Scanner;

public class IrregularPolygonTest
{

    public static void main(String[] args)
    {
        IrregularPolygon myShape = new IrregularPolygon();

        myShape.toAdd(20,10);
        myShape.toAdd(70,20);
        myShape.toAdd(50,50);
        myShape.toAdd(0,40);
 
        myShape.draw();
        System.out.println("Perimeter of figure = " + myShape.perimeter());
        System.out.println("Area of figure = " + myShape.area());
    }

}