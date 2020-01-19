
/**
 * An abstract class that contains all the foods on the menu. 
 *
 * @author Alexander Lin
 * @version 20180908
 */
public abstract class FoodType implements CookingMethod, Comparable <FoodType>
{
    public FoodType(){
       
    
    }
    
    private static  int food_price;
    
    
    @Override
    public int Baking(int food){
        return food*2;
        
    
    }
    @Override
    public int Broil(int food){
        return food*3;
    
    }
    @Override
    public int SousVide(int food){
        return food*9;
    
    }
    @Override
    public int Fry(int food){
        return food*2;
    
    }
    @Override
    public int Sear(int food){
        return food *4;
    }
    
    
    
}
