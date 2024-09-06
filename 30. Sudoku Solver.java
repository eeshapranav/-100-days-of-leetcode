37. Sudoku Solver

Time Complexity: O(9^m).
Space Complexity: O(1).

class Solution 
{
    public static boolean isSafe(char[][] board, int row, int col, int digit) 
  {
        // For column
        for (int i = 0; i <= 8; i++) 
        {
            if (board[i][col] == (char) (digit + '0')) 
            {
                return false;
            }
        }
        // For row
        for (int j = 0; j <= 8; j++) 
        {
            if (board[row][j] == (char) (digit + '0')) 
            {
                return false;
            }
        }
        // For grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) 
        {
            for (int j = sc; j < sc + 3; j++) 
            {
                if (board[i][j] == (char) (digit + '0')) 
                {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean solveSudoku(char[][] board, int row, int col) 
  {
        // Base case
        if (row == 9) 
        {
            return true;
        }
        // Recursion
        int nextRow = row;
        int nextCol = col + 1;
        if (col + 1 == 9) 
        {
            nextRow = row + 1;
            nextCol = 0;
        }
        if (board[row][col] != '.') 
        { 
            return solveSudoku(board, nextRow, nextCol);
        }
        for (int digit = 1; digit <= 9; digit++) 
        {
            if (isSafe(board, row, col, digit)) 
            {
                board[row][col] = (char) (digit + '0');
                if (solveSudoku(board, nextRow, nextCol)) 
                {
                    return true;
                }
                board[row][col] = '.';
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board) 
  {
     solveSudoku(board, 0, 0);
  }
}
