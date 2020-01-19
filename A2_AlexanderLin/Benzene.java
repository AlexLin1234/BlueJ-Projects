import gpdraw.*;
/**
 * Draws a chemical diagram on Benzene, a carbon-based chemical. 
 *
 * @author Alexander Lin
 * @version 20180826
 */
public class Benzene
{
    private DrawingTool Pencil;
    private SketchPad Paper;
    public Benzene(DrawingTool d){
        Pencil = d;
    }
    public void draw(){
        
        Pencil.down();
        Pencil.forward(100);
        Pencil.turnRight(60);
        Pencil.forward(100);
        Pencil.turnRight(60);
        Pencil.forward(100);
        Pencil.turnRight(60);
        Pencil.forward(100);
        Pencil.turnRight(60);
        Pencil.forward(100);
        Pencil.turnRight(60);
        Pencil.forward(100);
        Pencil.turnRight(60);
        Pencil.up();
        Pencil.turnRight(60);
        Pencil.forward(100);
        Pencil.down();
        Pencil.drawCircle(60);
        
        Pencil.up();
        
        
    
    }
}
