
/**
 * Write a description of class FriedGreenTomatoes here.
 *
 * @author Alexander Lin
 * @version 20180908
 */
public class FriedGreenTomatoes extends FoodType
{
    private String Food = "Tomatoes";
    private String Part = "Slices";
    private int Quantity;
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

    
    public String getMethod(){
        return this.Method;
    }
    public void setMethod(String Input){
        Method = Input;
    }
    public FriedGreenTomatoes(){
    }
}
