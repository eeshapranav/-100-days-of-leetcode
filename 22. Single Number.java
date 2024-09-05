136. Single Number

Time Complexity: O(n).
Space Complexity: O(1).

class Solution 
{
    public int singleNumber(int[] nums) 
    {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            count^=nums[i];
        }
        return count;
    }
}
