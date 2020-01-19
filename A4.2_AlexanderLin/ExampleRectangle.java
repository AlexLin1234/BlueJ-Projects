import gpdraw.*;
/**
 * Executes the functions that are created in the Rectangle Class
 *
 * @author Alexander Lin
 * @version 20180829
 */
public class ExampleRectangle
{
   

    
   
    
    public static void main(String [] args){    
        Rectangle rectA = new Rectangle();
        Rectangle rectB = new Rectangle(0, -80, 400, 160);
        Rectangle rectC = new Rectangle(100, -100, 20, 300);
        rectA.draw();
        rectB.draw();
        rectC.draw();
        System.out.println("RectA perimeter: " + rectA.getPerimeter());
        System.out.println("RectA area: " + rectA.getArea());
        System.out.println("RectB perimeter: " + rectB.getPerimeter());
        System.out.println("RectB area: " + rectB.getArea());
        System.out.println("RectC perimeter: " + rectC.getPerimeter());
        System.out.println("RectC area: " + rectC.getArea());
        
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */

}
