51. N-Queens

Time Complexity: O(N!).
Space Complexity: O(N^2).

class Solution 
{
    public List<List<String>> solveNQueens(int n) 
  {
        List<List<String>> results = new ArrayList<>();
        char[][] board = new char[n][n];
        // Initializing
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                board[i][j] = '.';
            }
        }
        nqueens(board, 0, results);
        return results;
    }
    public static boolean isSafe(char[][] board, int row, int col) 
  {
        // Vertical up
        for (int i = row - 1; i >= 0; i--) 
        {
            if (board[i][col] == 'Q') 
            {
                return false;
            }
        }
        // Diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) 
        {
            if (board[i][j] == 'Q') 
            {
                return false;
            }
        }
        // Diagonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) 
        {
            if (board[i][j] == 'Q') 
            {
                return false;
            }
        }
        return true;
    }
    public static void nqueens(char[][] board, int row, List<List<String>> results) 
  {
        // Base case
        if (row == board.length) 
        {
            results.add(constructBoard(board));
            return;
        }
        // Column loop
        for (int j = 0; j < board.length; j++) 
        {
            if (isSafe(board, row, j)) 
            {
                board[row][j] = 'Q'; 
                nqueens(board, row + 1, results);
                board[row][j] = '.'; // Backtracking
            }
        }
    }
    public static List<String> constructBoard(char[][] board) 
  {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < board.length; i++) 
        {
            result.add(new String(board[i]));
        }
        return result;
    }
    public static void main(String[] args) 
  {
        Solution sol = new Solution();
        int n = 4;
        List<List<String>> solutions = sol.solveNQueens(n);    
        // Printing all solutions
        for (List<String> solution : solutions) 
        {
            for (String row : solution) 
            {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
