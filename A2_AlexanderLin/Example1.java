import gpdraw.*;
/**
 * Write a description of class DrawHouse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Example1
{
    private static SketchPad Paper;
    private static DrawingTool Pencil;
    public Example1(){
        Paper = new SketchPad(500,500);
        Pencil = new DrawingTool(Paper);
        Benzene box1 = new Benzene(Pencil);

        box1.draw();
    }
}
