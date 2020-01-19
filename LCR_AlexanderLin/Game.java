
/**
 * The console version of the LCR game
 *
 * @author Alexander Lin
 * @version 20181119
 */
import java.util.Scanner;

public class Game{
    
    final static int L = 1; // pass to left, used from roll value
    final static int C = 2; // pass to center, used from roll value
    final static int R = 3; // pass to right, used from roll value
    final static int roll = 4; // do nothing, used from roll value
    
    static int numPlayers;
    static Player[] players;
    
    static boolean running = false; // Is the game still going?
    
    static int Pot = 0;
    
    public static void main(String[] args) throws InterruptedException{
        init();
        
        playGame();
    }
    
    // Initialize all the basic variables.
    private static void init(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of players: ");
        numPlayers = keyboard.nextInt();
        players = new Player[numPlayers];
        for(int i = 0; i < numPlayers; i++){
            players[i] = new Player();
        }
        running = true;
    }
    
    // Main game method.
    private static void playGame() throws InterruptedException{
        int currentPlayer = 1;    // whose turn is it
        int currentRoll = 0;    // what the die rolled for
        int numRolls = 0;       // the number of times a player must roll
        while(running){
            Thread.sleep(600); // Wait, so the user of the game can more easily read what's happening
            System.out.println("It is player " + currentPlayer + "'s turn.");
            numRolls = players[currentPlayer - 1].coins;
            if(numRolls > 0){
                for(int i = 0; i < numRolls; i++){
                    currentRoll = roll();
                    pass(currentPlayer, currentRoll);
                    Thread.sleep(200);
                }
            }else{
                System.out.println("Player " + currentPlayer + " doesn't have any coins.");
            }
            running = anyoneWon();
            currentPlayer++;
            if(currentPlayer > numPlayers) currentPlayer = 1;
        }
        int winningPlayer = getWhoWon();
        System.out.println("Player " + winningPlayer + " won with " + players[winningPlayer - 1].coins + " coins");
    }
    
    /*
     *
     * Either pass a coin to the left/right/left/do nothing at all, based on the currentRoll
     */
    private static void pass(int currentPlayer, int currentRoll){
        if(currentRoll == 4){
            System.out.println("Got a dot! Don't have to pass.");
            return;
        }
        if(currentRoll == L){ // pass to left
            System.out.println("Passing to the left.");
            if(currentPlayer > 1){// isn't the first player in the array
                players[currentPlayer - 1].coins--;
                players[currentPlayer - 2].coins++;
            }else{// is the first player in the array
                players[currentPlayer - 1].coins--;
                players[numPlayers - 1].coins++;
            }
        }
        else if(currentRoll == C){ // put coin in center pot
            System.out.println("Putting a coin in the center pot.");
            players[currentPlayer - 1].coins--;
            Pot++;
        }
        else if(currentRoll == R){ // pass to right
            System.out.println("Passing to the right.");
            if(currentPlayer < numPlayers){ 
                players[currentPlayer - 1].coins--;
                players[currentPlayer].coins++;
            }else{
                players[currentPlayer - 1].coins--;
                players[0].coins++;
            }
        }
    }
    
    private static int getWhoWon(){
        for(int i = 0; i < numPlayers; i++){
            if(players[i].coins > 0) return (i + 1);
        }
        return -1; // there's an error in game logic if this happens !!!
    }
    
    // Roll the dice to get one of four possible values.
    private static int roll(){
        int result = (int)(Math.random()*6) + 1;
        if(result > 4) result = 4;
        return result;
    }
    
    // Has anyone won?  i.e., does only one person have coins?
    private static boolean anyoneWon(){
        int numOfPlayersWithCoins = 0;
        for(int i = 0; i < numPlayers; i++){
            if(players[i].coins > 0) numOfPlayersWithCoins ++;
        }
        return numOfPlayersWithCoins > 1;
    }
    

    
    
    // Just holds a single value.  Don't need array. 
    static class Player{
        int coins = 3;
    }
}