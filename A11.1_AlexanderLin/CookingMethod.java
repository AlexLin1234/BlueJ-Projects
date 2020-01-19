
/**
 * Creates all techiniques for cooking the food, which makes a difference on the food's final price. 
 *
 * @author Alexander Lin
 * @version 20180908
 */
public interface CookingMethod
{

    abstract public int Baking(int food);
    abstract public int Fry(int food);
    abstract public int SousVide(int food);
    abstract public int Broil(int food);
    abstract public int Sear(int food);
}
