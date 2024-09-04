485. Max Consecutive Ones

Time Complexity: O(n).
Space Complexity: O(1).

class Solution 
{
  public int findMaxConsecutiveOnes(int[] nums) 
   {
      int n = nums.length;
      int count = 0;
      int result = 0;

      for(int i=0; i<n; i++)
      {
         if(nums[i]==1)
         {
            count++;
         }
         else
         {
            count=0;
         }
      result = Math.max(result,count);
      }
   return result;   
   }
}
