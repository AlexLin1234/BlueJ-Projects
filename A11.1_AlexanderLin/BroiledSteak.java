
/**
 * Write a description of class BroiledSteak here.
 *
 * @author Alexander Lin
 * @version 20180908
 */
public class BroiledSteak extends FoodType
{
    private String Food = "Cow";
    private String Part = "Filet Mignon";
    private int Quantity;
    private String Method = "Broiled";
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
    public BroiledSteak(){
    }
}
