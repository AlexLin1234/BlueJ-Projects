import java.util.Random;
/**
 * Contains the properties of the Knight (position, etc.) and moving. 
 *
 * @author Alexander Lin
 * @version 20190325
 */
public class Knight
{
    // instance variables - replace the example below with your own
    public int x;
    public int y;
    private Random movePicker;
    private final int MAXNUMMOVES = 8;
    
    public Knight()
    {
        x = 1;
        y = 1;
        movePicker = new Random();
    }
    public boolean move(int[][] board){
        int [][] possibleMoves = generateMoves();
        int numMovesTried = 0;
        while(numMovesTried < MAXNUMMOVES){
            int randMove = movePicker.nextInt(MAXNUMMOVES);
            if(possibleMoves[randMove] != null){
                int xMove = possibleMoves[randMove][0];
                int yMove = possibleMoves[randMove][1];
                if(xMove > 0 && xMove < 9 && yMove > 0 && yMove < 9 && board[xMove][yMove] == 0){
                    x = xMove;
                    y = yMove;
                    return true;
                
                }
                possibleMoves[randMove] = null;
                numMovesTried ++;
                
            }
            
        
        }
        return false;
        
    }
    public int[][] generateMoves(){
        int [][] moves = {{x + 2,y - 1},{x+2,y+1},{x-2,y+1},{x-2,y-1},{x+1,y+2},{x+1,y-2},{x-1,y+2},{x-1,y-2}};
        return moves;
    }
    
    
    
    
    
    
    
}
