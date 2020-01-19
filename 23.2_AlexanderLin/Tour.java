
/**
 * Board class that the knight moves across.
 *
 * @author Alexander Lin
 * @version 20190325
 */
public class Tour
{
    // instance variables - replace the example below with your own

    public static void main(String[] args){
        int[][] board = new int[9][9];
        Knight k = new Knight();
        boolean knightCanMove = true;
        int timesMoved = 1;
        board[1][1] = 1;
        while(knightCanMove){
            knightCanMove = k.move(board);
            board[k.x][k.y] = ++timesMoved;
            
            
        }
        System.out.print("\t");
        for(int i = 1;i<board.length;i++){
        
            System.out.print(i + "\t");
        }
        System.out.println();
        for(int i = 1;i<board.length;i++){
            for(int j = 0;j<board.length;j++){
                if(j == 0){
                    System.out.print(i + "\t");
                }
                else{
                    System.out.print(board[i][j] + "\t");
                    
                }
            }
            System.out.println();
        
        }
        System.out.println("Total number of squares covered: " + timesMoved);
    }
}
