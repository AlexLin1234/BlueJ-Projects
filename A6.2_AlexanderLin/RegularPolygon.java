import java.awt.geom.Point2D;
import java.awt.geom.Line2D;
import java.util.*;
import java.lang.Math;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

import java.awt.Rectangle;
/**
 * Contains all the attributes of a regular polygon along with the methods for calculating the radius of inscribed
 * and circumscribed circles and drawing the polygon. 
 *
 * @author Alexander Lin
 * @version 20180905
 */
public class RegularPolygon extends JComponent
{
    
    private int myNumSides;
    private double mySideLength;
    private double myR;
    private double myr;
    
    
    public RegularPolygon()
    {
       myNumSides = 3;
       mySideLength = 100;
    }
    
    public RegularPolygon(int numSides, double sideLength){
        myNumSides = numSides;
        mySideLength = sideLength;
    
    }
    //private methods
    private void calcr(){

        myr = (0.5)*mySideLength*(1/Math.tan(Math.PI/myNumSides));

    }
    private void calcR(){
        myR = (0.5)*mySideLength*(1/Math.sin(Math.PI/myNumSides));
    }
    //public methods
    public double vertexAngle(){
        return (180*(myNumSides-2))/myNumSides;
    }
    public double Perimeter(){
        return myNumSides*mySideLength;
    }
    public double Area(){
        return (myr * (myNumSides * mySideLength))/2;
    }
    public double getNumSide(){
        return myNumSides;
        
    }
    public double getSideLength(){
        return mySideLength;
    }
    public double getR(){
        this.calcR();
        return myR;
    }
    public double getr(){
        this.calcr();
        return myr;
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 =  (Graphics2D) g;
        
        double x = 200;
        double y = 200;
        
        
        for (int i = 1;i<myNumSides + 1;i++){
            double tempX = x;
            double tempY = y;
            x = x + mySideLength*Math.cos(i*(360/myNumSides)*Math.PI/180);
            y = y + mySideLength*Math.sin(i*(360/myNumSides)*Math.PI/180);
            Line2D.Double line = new Line2D.Double(tempX,tempY,x,y);
            g2.draw(line);
        }
        
        
        
       
        
    }
    
}
    
    



