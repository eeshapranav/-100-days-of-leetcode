62. Unique Paths

Time Complexity: O(m×n).
Space Complexity: O(m×n).

class Solution 
{
    public int uniquePaths(int i, int j, int m, int n, int[][] memo) 
    {
        if (i == m-1 && j == n-1) // Condition for last cell
        {
            return 1;
        }
        else if (i >= m || j >= n) // Condition for boundary conditions
        {
            return 0;
        }        
        if (memo[i][j] != -1) // Check if the value is already computed
        {
            return memo[i][j];
        }
        // Compute the value and store it in memo
        memo[i][j] = uniquePaths(i+1, j, m, n, memo) + uniquePaths(i, j+1, m, n, memo);
        return memo[i][j];
    }
    public int uniquePaths(int m, int n) 
    {
        int[][] memo = new int[m][n];
        for (int[] row : memo) 
        {
            Arrays.fill(row, -1);
        }
        return uniquePaths(0, 0, m, n, memo);
    }
}
