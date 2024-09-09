42. Trapping Rain Water

Time Complexity: O(n).
Space Complexity: O(n).

import java.util.*;
class Solution 
{
    public int trap(int[] height) 
    {
        int n = height.length;
        if (n==0) return 0;

        //Calculate leftmax = leftmax - array
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i=1; i<n; i++)
        {
            leftmax[i] = Math.max(leftmax[i-1], height[i]);
        }

        //Calculate rightmax = rightmax - array
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--)
        {
            rightmax[i] = Math.max(rightmax[i+1], height[i]);
        }

        //Calculate Trapped Water
        int TrappedWater = 0;
        for(int i=0; i<n; i++)
        {
            int WaterLevel = Math.min(leftmax[i], rightmax[i]);
            //TrappedWater = WaterLevel - height
            TrappedWater += WaterLevel - height[i];
        }
        return TrappedWater;
    }
}
