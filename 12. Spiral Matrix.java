54. Spiral Matrix

Time Complexity: O(m×n).
Space Complexity: O(1).

import java.util.ArrayList;
import java.util.List;
class Solution 
{
    public List<Integer> spiralOrder(int[][] matrix) 
  {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) 
        {
            return result;
        }
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) 
        {
            // Traverse right
            for (int j = startCol; j <= endCol; j++) 
            {
                result.add(matrix[startRow][j]);
            }
            startRow++;
            // Traverse down
            for (int i = startRow; i <= endRow; i++) 
            {
                result.add(matrix[i][endCol]);
            }
            endCol--;
            // Traverse left
            if (startRow <= endRow) 
            {
                for (int j = endCol; j >= startCol; j--) 
                {
                    result.add(matrix[endRow][j]);
                }
                endRow--;
            }
            // Traverse up
            if (startCol <= endCol) 
            {
                for (int i = endRow; i >= startRow; i--) 
                {
                    result.add(matrix[i][startCol]);
                }
                startCol++;
            }
        }
        return result;
    }
}



    
