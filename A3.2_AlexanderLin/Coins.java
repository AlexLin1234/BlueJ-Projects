
/**
 * Coins calculates the number of each coin used to get a certain number of cents.
 * This program prioritizes the more valuable coins(quarters) over the less valuable coins (pennies)
 *
 * @author Alexander Lin
 * @version 20180826
 */
public class Coins{
private int c;

public Coins(int cents){
c = cents;
}

public void calculate(){
System.out.println(c + " cents =>");
int quarters = c/25;
System.out.println("quarters = " + quarters);
c = c%25;
int dimes = c /10;
c = c%10;
System.out.println("dimes = " + dimes);
int nickels = c/5;
c = c%5;
System.out.println("nickels = " + nickels);
int pennies = c;
System.out.println("pennies = " + pennies);
System.out.println();
}
}