import gpdraw.*;
/**
 * Creates the class of Rectangle, with several properties and methods for the perimeter and area
 *
 * @author Alexander Lin
 * @version 20180829
 */
public class Rectangle
{
    // instance variables - replace the example below with your own
    private double myX;
    private double myY;
    private double myWidth;
    private double myHeight;
    private DrawingTool pen;
    private SketchPad paper;
    
    
    
    

    /**
     * Constructor for objects of class Rectangle
     */
    public Rectangle(double x, double y, double width, double height)
    {
        
        myX = x;
        myY = y;
        myWidth = width;
        myHeight = height;
        paper = new SketchPad(500,500);
        pen = new DrawingTool(paper);

    }
    public Rectangle(){
        myWidth = 0;
        myHeight = 0;
        myX = 0;
        myY = 0;
        paper = new SketchPad(500,500);
        pen = new DrawingTool(paper);
        
    
    }
    public void draw(){
        
        pen.up();
        pen.move(myX,myY);
        pen.down();
        pen.drawRect(myWidth,myHeight);
    
    
    }
    public double getPerimeter(){
        return (2*myWidth) + (2*myHeight);
    
    }
    public double getArea(){
        return myWidth * myHeight;
    }
    
    

}
