import java.awt.geom.Point2D;
import java.awt.geom.Line2D;
import java.util.*;
import java.lang.Math;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.*;
import javax.swing.JComponent;
import java.awt.Container;
import javax.swing.JFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JPanel;
/**
 * The test class for the RegularPolygon class
 *
 * @author Alexander Lin
 * @version 20180908
 */
public class ExamplePolygon extends JPanel
{
   
    public static void main(String [] args){
        JFrame squareFrame = new JFrame();
        JFrame octFrame = new JFrame();
        JFrame enneadecFrame = new JFrame();
        JFrame enneacontFrame = new JFrame();
        
        
        //code for square: displaying and method testing
        squareFrame.setSize(500,500);
        squareFrame.setTitle( "Square");
        squareFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RegularPolygon square = new RegularPolygon(4,10);
        squareFrame.add(square);
        squareFrame.setVisible(true);
        
        
        
        System.out.println("Square sides: " + square.getNumSide());
        System.out.println("Square side length: " + square.getSideLength());
        System.out.println("Square degrees: " + square.vertexAngle());
        System.out.println("Square inscribed circle length: " + square.getr());
        System.out.println("Square circumscribed circle length: " + square.getR());
        System.out.println("Square perimeter: " + square.Perimeter());
        System.out.println("Square area: " + square.Area() + "\n");
        
        
        //octagon code
        octFrame.setSize(500,500);
        octFrame.setTitle( "Octagon");
        octFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RegularPolygon octagon = new RegularPolygon(8,5.75);
        octFrame.add(octagon);
        octFrame.setVisible(true);
        
        System.out.println("Octagon sides: " + octagon.getNumSide());
        System.out.println("Octagon side length: " + octagon.getSideLength());
        System.out.println("Octagon degrees: " + octagon.vertexAngle());
        System.out.println("Octagon inscribed circle length: " + octagon.getr());
        System.out.println("Octagon circumscribed circle length: " + octagon.getR());
        System.out.println("Octagon perimeter: " + octagon.Perimeter());
        System.out.println("Octagon area: " + octagon.Area()+ "\n");
        
        //enneadecagon code
        enneadecFrame.setSize(500,500);
        enneadecFrame.setTitle( "Enneadecagon");
        enneadecFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RegularPolygon enneadec = new RegularPolygon(19,2);
        enneadecFrame.add(enneadec);
        enneadecFrame.setVisible(true);
        
        System.out.println("Enneadecagon sides: " + enneadec.getNumSide());
        System.out.println("Enneadecagon side length: " + enneadec.getSideLength());
        System.out.println("Enneadecagon degrees: " + enneadec.vertexAngle());
        System.out.println("Enneadecagon inscribed circle length: " + enneadec.getr());
        System.out.println("Enneadecagon circumscribed circle length: " + enneadec.getR());
        System.out.println("Enneadecagon perimeter: " + enneadec.Perimeter());
        System.out.println("Enneadecagon area: " + enneadec.Area()+ "\n");
        
        //enneadecagon code
        enneacontFrame.setSize(500,500);
        enneacontFrame.setTitle( "Enneacontakaihenagon");
        enneacontFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RegularPolygon enneacont = new RegularPolygon(91, 0.5);
        enneacontFrame.add(enneacont);
        enneacontFrame.setVisible(true);
        
        System.out.println("Enneacontakaihenagon sides: " + enneacont.getNumSide());
        System.out.println("Enneacontakaihenagon side length: " + enneacont.getSideLength());
        System.out.println("Enneacontakaihenagon degrees: " + enneacont.vertexAngle());
        System.out.println("Enneacontakaihenagon inscribed circle length: " + enneacont.getr());
        System.out.println("Enneacontakaihenagon circumscribed circle length: " + enneacont.getR());
        System.out.println("Enneacontakaihenagon perimeter: " + enneacont.Perimeter());
        System.out.println("Enneacontakaihenagon area: " + enneacont.Area()+ "\n");
        
        
    }

}
