
/**
 * A Food object whose price depends on how the food is cooked. 
 *
 * @author Alexander Lin
 * @version 20180908
 */
public class SearedSteak extends FoodType
{
    private String Food = "Cow";
    private String Part = "T-Bone";
    private int Quantity;
    private String Method = "Seared";
    
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
    public SearedSteak(){
    }
}
