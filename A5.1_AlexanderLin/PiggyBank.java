
/**
 *PiggyBank is a simulation of a real PiggyBank: The class has attributes like coins and methods like calculating the values of the coins 
 *
 * @author AlexanderLin
 * @version 20180903
 */
public class PiggyBank
{
    // instance variables - replace the example below with your own
    private int MyPennies;
    private int MyNickels;
    private int MyDimes;
    private int MyQuarters;

    /**
     * Constructor for objects of class PiggyBank
     */
    
    
    public PiggyBank()
    {
        int MyPennies;
        int MyNickels;
        int MyDimes;
        int MyQuarters;
        
    }
    public PiggyBank(int pennies, int nickels, int dimes, int quarters){
        MyPennies = pennies;
        MyNickels = nickels;
        MyDimes = dimes;
        MyQuarters = quarters;
    
    }
    
    /**
     * Methods for Class PiggyBank
     */
    //gets the number of each coin
    public int getPennies(){
        return MyPennies;
    }
    public int getNickels(){
        return MyNickels;
    }
    public int getDimes(){
        return MyDimes;
    }
    public int getQuarters(){
        return MyQuarters;
    }
    //adds new coins into the bank
    public void deposit(int pennies, int nickels, int dimes, int quarters){
        MyPennies = MyPennies +  pennies;
        MyNickels = MyNickels +  nickels;
        MyDimes = MyDimes +  dimes;
        MyQuarters = MyQuarters + quarters;
        
    }
    //calculates total value
    public double totalValue(){
        double output = (0.01 * MyPennies) + (0.05*MyNickels) + (0.10*MyDimes) + (0.25*MyQuarters);
        return output;
    
    }
    
}
