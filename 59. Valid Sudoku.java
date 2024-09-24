36. Valid Sudoku

Time Complexity : O(1).
Space Complexity : O(1).

class Solution 
{
    public boolean isValidSudoku(char[][] board) 
  {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        // Traverse the board
        for (int i = 0; i < 9; i++) 
        {
            for (int j = 0; j < 9; j++) 
            {
                char current = board[i][j];
                // Skip empty cells
                if (current == '.') 
                {
                    continue;
                }
                int num = current - '1'; 
                // Check the row
                if (rows[i][num]) 
                {
                    return false;
                }
                rows[i][num] = true;
                // Check the column
                if (cols[j][num]) 
                {
                    return false;
                }
                cols[j][num] = true;
                // Check the 3x3 box
                int boxIndex = (i / 3) * 3 + (j / 3);
                if (boxes[boxIndex][num]) 
                {
                    return false;
                }
                boxes[boxIndex][num] = true;
            }
        }
        return true;
    }
}
