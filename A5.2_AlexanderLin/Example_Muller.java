import gpdraw.*;
/**
 * Class in which the Ponzo and Muller test cases are executed
 *
 * @author Alexander Lin
 * @version 20180904
 */
public class Example_Muller
{
    // instance variables - replace the example below with your own
    private static SketchPad Paper;
    private static DrawingTool Pencil;
    private static SketchPad Paper2;
    private static DrawingTool Pencil2;

    /**
     * Constructor for objects of class Example_Muller
     */
    public Example_Muller()
    {
        Paper = new SketchPad(500,500);
        Pencil = new DrawingTool(Paper);
        Paper2 = new SketchPad(500,500);
        Pencil2 = new DrawingTool(Paper2);
        
        Muller box1 = new Muller(Pencil);
        Muller box2 = new Muller(Pencil2);
        
        

        box1.Muller();
        box1.Muller_vert();
       
        box2.Ponzo();
    }

}
