import java.util.Arrays;

public class BalloonBash {

    /**
     * The main control function for the game.
     */
    public static void main(String[] args) {
        // Algorithm:
        // Ask for input for rows and columns.
        // Initialize the board to random numbers (balloon colors) in the top 3 rows.
        // Set up the canvas.
        // As long as the game is not over:
        //      Print out how many points the player has.
        //      Draw the board.
        //      Pick a random balloon color from the ones on the board.
        //      Let the user click on the bottom row of the board.  Ignore clicks not on the bottom row.
        //      Place a new balloon in that square and re-draw the board.
        //      "Float" the balloon to the top of the screen.  Do this by making a loop that checks
        //          to see if the balloon can move up, and if it can, move it (on the board), re-draw
        //          the board, and pause the canvas for a small amount of time.
        //      Once the balloon reaches the top, check to see if it has at least one matching neighbor.
        //      If it does, "mark" the balloon with its corresponding negative number.
        //      Spread the negative number to all neighbors of the same (positive) number, until it can't spread anymore.
        //      Count the number of balloons marked, if it's at least three, then re-draw the board with
        //          the marked balloons in white.  Pause.
        //      Replace the marked balloons with empty spaces (zeroes).  Re-draw.  Pause.
        //      (You will need to handle the case where the marked region was only two balloons big, and if so,
        //          flip the negative numbers back to positive without removing them.)
        //      Calculate how many points are earned, and update the user's score.
        // When the game ends, print the final score.
    }

    /**
     * Draws the current state of the balloon board on the canvas.
     */
    public static void draw(SimpleCanvas canvas, int[][] board) {
        canvas.clear();
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                // Fill in code here.  Use tic-tac-toe as a guide.
                // Remember that each balloon number represents what color it should be:
                // 1-4 are colors of your choice, negative numbers indicate "marked" balloons
                // that are being spread, and should be drawn white (or some other special color),
                // and 0 is an empty cell.
            }
        }
        canvas.update();
    }

    /**
     * Allows the user to click the game board on the bottom row.  This function will not end
     * until the user selects a blank cell on the bottom row of the board.
     * Returns a 2-element integer array of the row and column that was clicked.
     */
    public static int[] handleMouseClick(SimpleCanvas canvas, int[][] board) {
        // Use the equivalent function from tic-tac-toe as a guide.
        // You will need to use a loop to ensure the user can only select a square
        // on the bottom row.  Note that the function returns an int[] array;
        // this is so you can return a 2-element array of the row & column that the user
        // clicked on (this information is needed back in the main method).

        // Algorithm: Wait for a mouse click, convert the x/y coordinates to row/column,
        // make sure it's on the bottom row and return it if so.  If it's not on the bottom row,
        // keep getting more mouse clicks until it is.

        // Example of how to return the array:
        // int[] clickedRowCol = new int[] { row, col };
        // return clickedRowCol;

        // This line below is only here so the program will compile and run.  You should remove it
        // when you start writing this method.
        return null;
    }

    /**
     * Prints the state of the balloon board.  Useful for when the graphics aren't working yet.
     */
    public static void printBoard(int[][] board) {
        for (int row = 0; row < board.length; row++) {
            System.out.println(Arrays.toString(board[row]));
        }
    }
}