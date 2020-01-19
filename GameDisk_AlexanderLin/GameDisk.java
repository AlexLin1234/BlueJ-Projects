import java.util.Scanner;
/**
 * GameDisk is the program that goes through the discs in the manner instructed and also resets the game state once
 * done. 
 *
 * Alexander Lin
 * 20181206
 */

public class GameDisk
{
    Disk[] game_disks = new Disk[100];
    public static int total;
    public static boolean running;
    public GameDisk()
    {
        
    }
    
    public void numberDisks()
    {
        for(int x = 1; x < game_disks.length; x++)
        {
            game_disks[x] = new Disk();
            game_disks[x].spin();
            System.out.println("Disk number " + x + "; Value of disk: " + game_disks[x].getValue());
        }
    }
    
    public void play(int n)
    {
        running = true;
        int x;
        x = n;
        numberDisks();
        System.out.println("------------------------");
        System.out.println("Disk to start " + n);
        System.out.println(game_disks[n]);
        
        while (running)
        {
           int y = total;
           total = x + game_disks[x].getValue();
           x = total;
           if (x <= 100)
           {
                System.out.println("Disk Number  " + total + " " + game_disks[x]);
           } 
           
           else 
           {
                System.out.println("Final Disk " + y);
                running = false;
           }
        }
        running = resetGame();
    }
    
    public boolean resetGame(){
        System.out.println("Do you want to play again? (y/n)");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        if(answer.equalsIgnoreCase("y")){
            GameRunner.instructions();
            return true;
        } else {
            System.out.println("Thanks for playing!");
            return false;
        }
    }
}
