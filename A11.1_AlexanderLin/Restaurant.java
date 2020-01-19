import java.util.Scanner;
import java.util.ArrayList;
/**
 * Restaurant is the Engine class of the program, which takes each of the 5 objects created and runs their functions. 
 *
 * @author Alexander Lin
 * @version 20180908
 */
public class Restaurant
{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int money = 0;
   int action = 0;
   System.out.println("Welcome to CS61A's Restaurant! Where each piece of food is an object.");
   System.out.println("Press 1 for some Chicken, 2 for Steak, 3 for Vegetarian Options, and 4 to end your meal");
   action = sc.nextInt();
   ArrayList<Integer> Bill = new ArrayList <Integer>();
   
   while(action !=4){
    if(action==1){
        System.out.println("Press 1 for Fried and 2 for Roasted");
        action = sc.nextInt();
        if(action == 1){
            FriedChicken Fc = new FriedChicken();
            System.out.println(Fc);
            System.out.println(Fc.getFood());
            System.out.println(Fc.getPart());
            System.out.println(Fc.getMethod());
            money += Fc.Fry(3);
        }
        else if(action == 2){
            RoastedChicken Rc = new RoastedChicken();
            System.out.println(Rc);
            System.out.println(Rc.getFood());
            System.out.println(Rc.getPart());
            System.out.println(Rc.getMethod());
            money += Rc.Baking(1);
            
        }
    }
    else if(action == 2){
        System.out.println("Press 1 for Seared, 2 for Broiled, and 3 for Sous-Vide");
        action = sc.nextInt();
        if(action == 1){
            SearedSteak Ss = new SearedSteak();
            System.out.println(Ss);
            System.out.println(Ss.getFood());
            System.out.println(Ss.getPart());
            System.out.println(Ss.getMethod());
            money += Ss.Sear(1);
        }
        if(action == 2){
             BroiledSteak Bs = new BroiledSteak();
            System.out.println(Bs);
            System.out.println(Bs.getFood());
            System.out.println(Bs.getPart());
            System.out.println(Bs.getMethod());
            
            money += Bs.Broil(1);
        
        }
        else if(action == 3){
            SousVideSteak SvS = new SousVideSteak();
            System.out.println(SvS);
            System.out.println(SvS.getFood());
            System.out.println(SvS.getPart());
            System.out.println(SvS.getMethod());

            money += SvS.SousVide(1);
            
        }
    
    }
    
    else if (action == 3){
        FriedGreenTomatoes Ft = new FriedGreenTomatoes();
       System.out.println(Ft);
        System.out.println(Ft.getFood());
        System.out.println(Ft.getPart());
        System.out.println(Ft.getMethod());
        money += Ft.Fry(1);
        
        
    }
    System.out.println("Do you want anything else?");
    System.out.println("Press 1 for some Chicken, 2 for Steak, 3 for Vegetarian Options, and 4 to end your meal");
    action = sc.nextInt();
    
    }
    System.out.println("Thank you for coming! Your bill is $" + money);
}
   
}
