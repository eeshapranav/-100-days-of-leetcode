560. Subarray Sum Equals K

Time Complexity : O(n).
Space Complexity : O(n).

import java.util.HashMap;
class Solution 
{
    public int subarraySum(int[] nums, int k) 
    {
        int count = 0;
        int cs = 0;

        HashMap<Integer,Integer> sumMap = new HashMap<>();
        sumMap.put(0,1);

        for(int i=0; i<nums.length; i++)
        {
            cs += nums[i];
            if(sumMap.containsKey(cs-k))
            {
                count += sumMap.get(cs-k);
            } 
            sumMap.put(cs,sumMap.getOrDefault(cs,0)+1);
        }
        return count;
    }
}
