import java.util.Scanner;
/**
 * I am creating the GameDisk game that follows all the instructions given. 
 *
 * Alexander Lin
 * 20181206
 */

public class GameRunner
{
    public static int x;
    public static void main(String[] args){
       boolean game_running = true;
       boolean game_has_no_end = true;
       GameDisk game1 = new GameDisk();
       instructions();
    
        while (game_has_no_end){
        game1.play(x);
        game_has_no_end = game1.running;
       }
    }
    
    public static void instructions()
    {
        System.out.println("Pick a disk and watch what happens!");
        System.out.println("The disk will be added to its value and the next disk will be chosen by the sum.");
        System.out.println("The game will continue to run until the sum is going to be greater than 100."); 
        System.out.println("What disk do you want to start at?(From 1-100)");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        while (x <= 0 || x >= 100){
            if (x == 100){
                System.out.println("Final disk: 100");
                
            }
            System.out.println("Pick another disk.");
            x = input.nextInt();
        }
    }
}
