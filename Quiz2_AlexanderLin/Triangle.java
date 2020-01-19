import java.awt.geom.Point2D;
import java.util.Scanner;
import java.math.*;
import java.awt.Polygon;
/**
 * The class Triangle creates 3 Point2D points randomly, gets 2 points from user input, and then calculates whether the point is
 * inside the triangle. 
 *
 * @author Alexander Lin
 * @version 20180917
 */
public class Triangle
{
    
  

   
    public static void main(String[] args){
        //creates 3 points randomly
        Point2D point1 = new Point2D.Double((int)(Math.random()*200),(int)(Math.random()*200));
        Point2D point2 = new Point2D.Double((int)(Math.random()*200),(int)(Math.random()*200));
        Point2D point3 = new Point2D.Double((int)(Math.random()*200),(int)(Math.random()*200));
        int[] x_array = new int[3];
        int[] y_array = new int[3];
        x_array[0] = (int)point1.getX();
        x_array[1] = (int)point2.getX();
        x_array[2] = (int)point3.getX();
        
        y_array[0] = (int)point1.getY();
        y_array[1] = (int)point2.getY();
        y_array[2] = (int)point3.getY();
        //creates polygon triangle
        Polygon new_polygon = new Polygon(x_array, y_array, 3);
        //asks for input from user
        Scanner sc = new Scanner(System.in);
        
        
        
        
        
        
        
        System.out.println("Please enter an x value between 1-199: ");
        int x = sc.nextInt();
        System.out.println("Please enter a y value between 1-199: ");
        int y = sc.nextInt();
        
        
        //outputs the results and checks whether the input point are inside the triangle
        System.out.println("A triangle is defined by the following three points: ");
        System.out.println("(" + point1.getX() + " , " + point1.getY() + ")");
        System.out.println("(" + point2.getX() + " , " + point2.getY() + ")");
        System.out.println("(" + point3.getX() + " , " + point3.getY() + ")");
        if(new_polygon.contains(x,y)){
            System.out.println("The point (" + x + ", " + y + ") is inside the triangle");
        }
        else{
            System.out.println("The point (" + x + ", " + y + ") is not inside the triangle");
        }
        
    }
    
}
