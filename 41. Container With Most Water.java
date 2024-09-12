11. Container With Most Water

Time Complexity: O(n).
Space Complexity: O(1).

class Solution 
{
    public int maxArea(int[] height) 
    {
        int trappedWater = 0;
        int lp = 0;
        int rp = height.length - 1;

        while (lp < rp)
        {
            int hi = Math.min(height[lp], height[rp]);
            int width = rp - lp;
            // Calculate area
            int storedWater = hi * width;
            trappedWater = Math.max(trappedWater, storedWater);

            if (height[lp] < height[rp]) 
            {
                lp++;
            } 
            else 
            {
                rp--;
            }
        }
        return trappedWater;
    }
}
