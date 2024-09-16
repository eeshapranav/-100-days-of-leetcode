532. K-diff Pairs in an Array

Time Complexity : O(n).
Space Complexity : O(n).

import java.util.HashMap;
class Solution 
{
    public int findPairs(int[] nums, int k) 
    {
        if (k < 0) 
        {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++)    
        {
            if (map.containsKey(nums[i])) 
            {
                map.put(nums[i], map.get(nums[i]) + 1);
            } 
            else 
            {
                map.put(nums[i], 1);
            }
        }

        int count = 0;

        for (int num : map.keySet()) 
        {
            if (k == 0) 
            {
                if (map.get(num) >= 2) 
                {
                    count++;
                }
            } 
            else 
            {
                int target = num + k;
                if (map.containsKey(target)) 
                {
                    count++;
                }
            }
        }
        return count;
    }
}
