
/**
 * A Food object whose price depends on how the food is cooked. 
 *
 * @author Alexander Lin
 * @version 20180908
 */
public class RoastedChicken extends FoodType
{
    private String Food = "Chicken";
    private String Part = "Entirety";
    private int Quantity;
    private String Method = "Roasted";
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
    public RoastedChicken(){
    }
}
