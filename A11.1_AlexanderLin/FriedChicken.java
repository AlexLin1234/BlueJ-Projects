
/**
 * Write a description of class FriedChicken here.
 *
 * @author Alexander Lin
 * @version 20180908
 */
public class FriedChicken extends FoodType
{
    
    private String Food = "Chicken";
    private String Part = "Thigh";

    private String Method = "Fried";
    public String getFood(){
        return this.Food;
    }
    public void SetFood(String Input){
        Food = Input;
    }
    public String getPart(){
        return this.Part;
    }
    public void setPart(String Input){
        Part = Input;
    }
    public String toString(){
        return "The food is " + Method + " "+ Part + " of "   + Food + ".";
    
    }
    
    public String getMethod(){
        return this.Method;
    }
    public void setMethod(String Input){
        Method = Input;
    }
    public FriedChicken(){
    }
    
    
    
    
}