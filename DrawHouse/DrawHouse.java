import gpdraw.*;
/**
 * Write a description of class House here.
 *
 * @author Alexander Lin
 * @version 20180821
 */

public class DrawHouse
{
    
    // instance variables - replace the example below with your own
   
    private DrawingTool Pencil;
    private SketchPad Paper;
    public DrawHouse(DrawingTool d){
        Pencil = d;
    }
    public void draw(){
        
        Pencil.down();
        Pencil.turnRight(90);
        Pencil.forward(100);
        Pencil.turnLeft(90);
        
        Pencil.forward(100);
        Pencil.turnLeft(90);
        Pencil.forward(100);
        Pencil.backward(100);
        Pencil.turnRight(90);
        Pencil.turnLeft(45);
        Pencil.forward(Math.sqrt(2)*50);
        Pencil.turnLeft(90);
        Pencil.forward(Math.sqrt(2)*50);
        Pencil.turnLeft(45);
        Pencil.forward(100);
        Pencil.turnLeft(90);
        Pencil.forward(100);
        /** transition to next house
         * 
         */
        Pencil.up();
        Pencil.turnRight(90);
        Pencil.forward(200);
        
        Pencil.turnRight(180);
        Pencil.down();
        /**
         * 
         */
        Pencil.turnRight(90);
        Pencil.forward(100);
        Pencil.turnLeft(90);
        
        Pencil.forward(100);
        Pencil.turnLeft(90);
        Pencil.forward(100);
        Pencil.backward(100);
        Pencil.turnRight(90);
        Pencil.turnLeft(45);
        Pencil.forward(Math.sqrt(2)*50);
        Pencil.turnLeft(90);
        Pencil.forward(Math.sqrt(2)*50);
        Pencil.turnLeft(45);
        Pencil.forward(100);
        Pencil.turnLeft(90);
        Pencil.forward(100);
        
        
        
        
    
    }
    
}
