
/**
 * IrregularPolygon is a class that draws an irregular polygon based on points added. Also calculates the area and 
 * perimeter of the polygon. 
 *
 * @author Alexander Lin
 * @version 20190125
 */

import java.awt.geom.*;
import java.util.ArrayList;
import gpdraw.*;

public class IrregularPolygon
{
    private ArrayList <Point2D.Double> myPolygon ;
    private double x;
    private double y;
    private double perim;
    private double total;
    private DrawingTool myPen;
    private SketchPad myPaper;

    public IrregularPolygon()
    {    
        //ArrayList <Point2D.Double> myPolygon 
        myPolygon = new ArrayList <Point2D.Double>();
        x = 1;
        y = 1;
        perim = 0.0;
        total = 0.0;
        myPaper = new SketchPad(500,500);
        myPen = new DrawingTool(myPaper);
    }

    public void toAdd(Point2D.Double myPoint)
    {
        myPolygon.add(myPoint);
    }

    public void toAdd(int x, int y)
    {
        myPolygon.add(new Point2D.Double(x,y));
    }

    public void draw()
    {
        myPen.up();
        myPen.move(myPolygon.get(0).getX(), myPolygon.get(0).getY());
        myPen.down();

        for(int i = 0; i < myPolygon.size(); i++)
        {
            myPen.move(myPolygon.get(i).getX(), myPolygon.get(i).getY());
        }
        myPen.move(myPolygon.get(0).getX(), myPolygon.get(0).getY());
    }

    public double perimeter()
    {
        for(int i = 0; i <= myPolygon.size()-2; i++)
        {
            perim += ((Point2D.Double)myPolygon.get(i)).distance((Point2D.Double)myPolygon.get(i + 1));
        }
        perim += ((Point2D.Double)myPolygon.get(myPolygon.size()-1)).distance((Point2D.Double)myPolygon.get(0));
        return perim;
    }

    public double area()
    {
        for(int i = 0; i < myPolygon.size()-2; i++)
        {
            double X1 = (myPolygon.get(i).getX());
            double Y1 = (myPolygon.get(i).getY());

            double X2 = (myPolygon.get(i + 1).getX());
            double Y2 = (myPolygon.get(i + 1).getY());
            total += (X1 * Y2 - Y1 * X2);
        }
        return 0.5 * total;
    }
}