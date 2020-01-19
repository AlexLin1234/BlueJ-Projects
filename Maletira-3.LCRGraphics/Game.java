import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JComponent;
import java.awt.geom.Rectangle2D;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.util.*;
/**
 * This class handles the logical part of the game, from the winning conditions to the 
 * coin-passing to the turn-based gameplay. 
 *
 * @author Alexander Lin, Karthik Talluri, Rohan Maletira
 * @version 20181129
 */
public class Game{
    //initializing variables
    JPanel Panel;
    JPanel secondPanel;
    JPanel dicePanel;
    JButton DiceRoller;
    Rectangle2D r;
    int x,y,width,height;

    final static int Left = 1; // pass to left, used from roll value
    final static int Center = 2; // pass to center, used from roll value
    final static int Right = 3; // pass to right, used from roll value
    final static int X = 4; // do nothing, used from roll value
    public static int numRolls;
    static int players;
    public static Player[] allplayers;
    public static int currentPlayer;
    public static int currentRoll;
    public static int[] coins;
    static boolean running = false; 

    static int centerPot = 0;

    //Main method
    /*
    public static void main(String[] args) throws InterruptedException{
    begin(3);
    play();
    }
     */

    // Initialize all the basic variables.
    public static void begin(int number_of_players) 
    {

        allplayers = new Player[number_of_players];
        for(int i = 0; i < number_of_players; i++)
        {
            allplayers[i] = new Player();

        }
        running = true;

    }

    // Main game method that will print out statements 
    public static void play(int currentP,  int currentR,  int numR) /*throws InterruptedException*/{

        /*
        while(running)
        {
         */
        //Thread.sleep(600); 
        if(numR == 0){
            currentPlayer = currentP;
            currentRoll = currentR;
            numRolls = numR;

        }
        System.out.println("It is player " + currentPlayer + "'s turn.");
        numRolls = allplayers[currentPlayer - 1].coins;
        if(numRolls > 0)
        {
            for(int i = 0; i < numRolls; i++)
            {
                currentRoll = rollDice();
                passCoin(currentPlayer, currentRoll);

                //Thread.sleep(200);
            }
        }

        else{
            System.out.println("Player " + currentPlayer + " doesn't have any coins.");
        }
        running = checkCoins();
        currentPlayer++;
        if(currentPlayer > players) currentPlayer = 1;

        

        //}
        
        if(running == false){
            int winningPlayer = whoWon();
            System.out.println("Player " + winningPlayer + " won with " + allplayers[winningPlayer - 1].coins + " coins");
        }
    }

    //method to pass the coin between users
    public static void passCoin(int currentPlayer, int currentRoll){
        if(currentRoll == 4){
            System.out.println("Got a dot! Don't have to pass.");
            return;
        }

        // Pass to the left
        if(currentRoll == Left)
        { 
            System.out.println("Passing to the left.");
            if(currentPlayer > 1)
            {
                allplayers[currentPlayer - 1].coins--;
                allplayers[currentPlayer - 2].coins++;
            }
            else{
                allplayers[currentPlayer - 1].coins--;
                allplayers[players - 1].coins++;
            }
        }

        //Pass to the right
        else if(currentRoll == Right)
        { 
            System.out.println("Passing to the right.");
            if(currentPlayer < players)
            {
                allplayers[currentPlayer - 1].coins--;
                allplayers[currentPlayer].coins++;
            }

            else{
                allplayers[currentPlayer - 1].coins--;
                allplayers[0].coins++;
            }
        }

        //Put the coin in the center
        else if(currentRoll == Center)
        {
            System.out.println("Putting a coin in the center pot.");
            allplayers[currentPlayer - 1].coins--;
            centerPot++;
        }
    }

    // The user will roll the dice to get one of four possible values
    public static int rollDice()
    {
        int result = (int)(Math.random() * 6) + 1;
        if(result > 4) 
            result = 4;

        return result;
    }

    // Does only one person have any coins left?
    public static boolean checkCoins()
    {
        int numOfPlayersWithCoins = 0;
        for(int i = 0; i < players; i++)
        {
            if(allplayers[i].coins > 0) 
                numOfPlayersWithCoins ++;
        }

        return numOfPlayersWithCoins > 1;
    }

    // Returns the winner of the game.
    public static int whoWon(){
        for(int i = 0; i < players; i++)
        {
            if(allplayers[i].coins > 0) {

                return (i + 1);}

        }

        return -1; 
    }

}  
class Player
{
    int coins = 3;
}