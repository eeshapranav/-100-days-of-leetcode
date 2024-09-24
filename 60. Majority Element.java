169. Majority Element

Time Complexity : O(n).
Space Complexity : O(1).

class Solution 
{
    public int majorityElement(int[] nums) 
    {
        int n = nums.length;
        int element = nums[0];
        int count = 1;

        for(int i=1; i<n; i++)
        {
            if(nums[i]==element)
            {
                count++;
            }
            else
            {
                count--;
            }
            if(count==0)
            {
                element = nums[i];
                count = 1;
            }
        }
        return element;
    }
}
