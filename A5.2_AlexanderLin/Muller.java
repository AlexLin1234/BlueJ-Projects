import gpdraw.*;
/**
 * Draws the Muller and Ponzo optical illusions
 *
 * @author Alexander Lin
 * @version 20180904
 */
public class Muller
{
    // instance variables - replace the example below with your own
    private DrawingTool Pencil;
    private SketchPad Paper;
    public Muller(DrawingTool d)
    {
        // initialise instance variables
        Pencil = d;
    }
    public void Muller(){
        Pencil.up();
        Pencil.move(100,0);
        Pencil.setDirection(90);
        Pencil.down();
        Pencil.turnRight(90);
        Pencil.forward(100);
        //arrows on one side
        Pencil.turnLeft(60);
        Pencil.forward(20);
        Pencil.backward(20);
        Pencil.turnRight(120);
        Pencil.forward(20);
        Pencil.backward(20);
        Pencil.turnLeft(60);
        Pencil.turnLeft(180);
        Pencil.forward(100);
        //arrows on the other side
        Pencil.turnRight(60);
        Pencil.forward(20);
        Pencil.backward(20);
        Pencil.turnLeft(120);
        Pencil.forward(20);
        Pencil.backward(20);
        
        
        
        //transition to next shape
        Pencil.turnRight(150);
        Pencil.up();
        Pencil.forward(150);
        Pencil.down();
        Pencil.turnRight(90);
       
        //next "shorter" shape starts
        Pencil.turnLeft(60);
        Pencil.forward(20);
        Pencil.backward(20);
        Pencil.turnRight(120);
        Pencil.forward(20);
        Pencil.backward(20);
        Pencil.turnLeft(60);
        Pencil.forward(100);
        Pencil.turnLeft(120);
        Pencil.forward(20);
        Pencil.backward(20);
        Pencil.turnLeft(120);
        Pencil.forward(20);
        Pencil.backward(20);
        Pencil.turnRight(60);
        
        
        
    
    }
    public void Muller_vert(){
        //first arrow
        
        
        Pencil.up();
        Pencil.move(0,0);
        Pencil.down();
        Pencil.setDirection(90);
        Pencil.forward(100);
        //arrows on one side
        Pencil.turnLeft(60);
        Pencil.forward(20);
        Pencil.backward(20);
        Pencil.turnRight(120);
        Pencil.forward(20);
        Pencil.backward(20);
        Pencil.turnLeft(60);
        Pencil.turnLeft(180);
        Pencil.forward(100);
        //arrows on the other side
        Pencil.turnRight(60);
        Pencil.forward(20);
        Pencil.backward(20);
        Pencil.turnLeft(120);
        Pencil.forward(20);
        Pencil.backward(20);
        Pencil.turnRight(60);
        
        /**
        //transition to next shape
        Pencil.turnRight(150);
        Pencil.up();
        Pencil.forward(150);
        Pencil.down();
        Pencil.turnRight(90);
       **/
        //next "shorter" shape starts
        Pencil.turnLeft(60);
        Pencil.forward(20);
        Pencil.backward(20);
        Pencil.turnRight(120);
        Pencil.forward(20);
        Pencil.backward(20);
        Pencil.turnLeft(60);
        Pencil.forward(100);
        Pencil.turnLeft(120);
        Pencil.forward(20);
        Pencil.backward(20);
        Pencil.turnLeft(120);
        Pencil.forward(20);
        Pencil.backward(20);
        Pencil.turnRight(60);
        
        
        
        
       
        
        
    }
    public void Ponzo(){
        Pencil.setDirection(90);
        //illusion lines
        Pencil.up();
        Pencil.move(0.0,300.0);
        Pencil.down();
        Pencil.turnRight(50);
        Pencil.forward(300);
        Pencil.up();
        
        Pencil.up();
        Pencil.move(0.0,280.0);
        Pencil.down();
        Pencil.turnRight(180);
        Pencil.turnRight(10);
        Pencil.forward(300);
        Pencil.up();
        
        Pencil.move(0.0,250.0);
        
        Pencil.down();
        Pencil.turnRight(180);
        Pencil.turnRight(10);
        Pencil.forward(300);
        
        Pencil.up();
        Pencil.move(0.0,230.0);
        Pencil.down();
        Pencil.turnRight(180);
        Pencil.turnRight(10);
        Pencil.forward(300);
        Pencil.up();
        
        Pencil.up();
        Pencil.move(0.0,200.0);
        Pencil.down();
        Pencil.turnRight(180);
        Pencil.turnRight(10);
        Pencil.forward(300);
        
        Pencil.up();
        Pencil.move(0.0,180.0);
        Pencil.down();
        Pencil.turnRight(180);
        Pencil.turnRight(10);
        Pencil.forward(300);
        Pencil.up();
        
        
        Pencil.up();
        Pencil.move(0,150);
        Pencil.down();
        Pencil.turnRight(180);
        Pencil.turnRight(10);
        Pencil.forward(300);
        
        Pencil.up();
        Pencil.move(0.0,120.0);
        Pencil.down();
        Pencil.turnRight(180);
        Pencil.turnRight(10);
        Pencil.forward(300);
        Pencil.up();
        
        
        Pencil.up();
        Pencil.move(0,100);
        Pencil.down();
        Pencil.turnRight(180);
        Pencil.turnRight(10);
        Pencil.forward(300);
        
        Pencil.up();
        Pencil.move(0.0,70.0);
        Pencil.down();
        Pencil.turnRight(180);
        Pencil.turnRight(10);
        Pencil.forward(300);
        Pencil.up();
        
        
        Pencil.up();
        Pencil.move(0,50);
        Pencil.down();
        Pencil.turnRight(180);
        Pencil.turnRight(10);
        Pencil.forward(300);
        
        
        //drawing the two lines
        Pencil.up();
        Pencil.move(100,70);
        Pencil.down();
        Pencil.setDirection(90);
        Pencil.forward(200);
        Pencil.up();
        Pencil.move(130,70);
        Pencil.setDirection(90);
        Pencil.down();
        Pencil.forward(200);
        
    }
    
}
