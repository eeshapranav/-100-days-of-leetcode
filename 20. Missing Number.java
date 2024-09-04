268. Missing Number

Time Complexity: O(n).
Space Complexity: O(1).

class Solution 
{
    public int missingNumber(int[] nums) 
    {
        int n=nums.length;
        int orgsum = n * (n+1) / 2;
        int sum=0;
      
        for(int i=0; i<n; i++)
        {
           sum += nums[i];
        }
    return orgsum-sum;    
    }
}
