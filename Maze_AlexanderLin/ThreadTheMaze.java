import java.io.File;
import java.util.Scanner;
import java.io.IOException;
/**
 * ThreadTheMaze uses the function ThreadMaze which recursively goes through a text file (a text "maze")
 *
 * @author Alexander Lin
 * @version 20190302
 */
public class ThreadTheMaze
{
    private final static char BLANK = ' ';
    private static final int MAXROW = 12;
    private static final int MAXCOL = 12;
    private int myMaxRow;
    private int myMaxCol;
    private char [][] myMaze;
    public ThreadTheMaze(){
        /**
         * Description of the Field
         */
        myMaze = new char [MAXROW + 1][MAXCOL + 1];
        myMaxRow = myMaze.length - 1;
        myMaxCol = myMaze[0].length - 1;
    }

    /**
     * Initiates the trace process
     *
     * @param none
     */
    public void doTraceMaze() {
        loadMaze();
        traceMaze(myMaze, myMaxRow/2, myMaxCol/2);
    }

    /**
     * Loads the maze characters from mazeData.txt
     *
     * @param maze Description of Parameter
     */
    private void loadMaze(){
        String line;
        Scanner in;
        try{
            in = new Scanner(new File("mazeData.txt"));

            for (int row = 1; row <= myMaxRow; row++){
                line = in.nextLine();
                for (int col = 1; col <= myMaxCol; col++){
                    myMaze[row][col] = line.charAt(col-1);
                }
            }
        }catch(IOException i){
            System.out.println("Error: " + i.getMessage());
        }
    }

    /**
     * Prints the maze while traceMaze traces a path
     *
     * @param maze A char variable that represents the maze board
     */
    public void printMaze(char[][] maze){
        Scanner console = new Scanner(System.in);

        for (int row = 1; row <= myMaxRow; row++){
            for (int col = 1; col <= myMaxCol; col++){
                System.out.print("" + maze[row][col]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Hit enter to see if there are more solutions.");
        String anything = console.nextLine();
    }

    /**
     * Will attempt to find a path out of the maze. A
     * path will be marked with the ! marker. The method 
     * makes a copy of the array each time so that only 
     * the path out will be marked, otherwise extra ! 
     * markers will appear in the answer.
     * The function is recursive.
     *
     * @param maze A char variable that represents the maze board
     * @param row The current row of the function
     * @param col The current col of the current position
     */
    public void traceMaze(char[][] maze, int row, int col){
        //char[][] mazeCopy = (char[][])maze.clone();

        char[][] mazeCopy = new char[maze.length][maze[0].length];
        for (int r = 0; r < mazeCopy.length; r++){
            for (int c = 0; c < mazeCopy[0].length; c++){
                mazeCopy[r][c] = maze[r][c];
            }
        }

        if (1 <= row && row <= myMaxRow && 1 <= col && col <= myMaxCol){
            // boundary check, if false, a base case
            if (BLANK == mazeCopy[row][col]){
                // if false, base case
                mazeCopy[row][col] = '!';
                if (1 == row || myMaxRow == row || 1 == col || myMaxCol == col){
                    printMaze(mazeCopy); // base case
                }else{
                    traceMaze(mazeCopy, row - 1, col);
                    traceMaze(mazeCopy, row, col + 1);
                    traceMaze(mazeCopy, row + 1, col);
                    traceMaze(mazeCopy, row, col - 1);
                }
            }
        }
    }

}
