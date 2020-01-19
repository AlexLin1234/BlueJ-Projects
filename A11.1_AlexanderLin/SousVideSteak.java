
/**
 * A Food object whose price depends on how the food is cooked. Steak is expensive, and sous-vide takes a lot of time. 
 *
 * @author Alexander Lin
 * @version 20180908
 */
public class SousVideSteak extends FoodType
{
    private String Food = "Cow";
    private String Part = "Filet Mignon";
    private int Quantity;
    private String Method = "Sous-Vide";
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
    
    public int compareTo(FoodType f){
    return 0;
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
    public SousVideSteak(){
    }
}
