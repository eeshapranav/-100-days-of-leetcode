912. Sort an Array

Time Complexity: O(n^2).
Space Complexity: O(1).

#Used Insertion sort
class Solution 
{
    public int[] sortArray(int[] nums) 
    {
        for(int i=1; i<nums.length; i++)
        {
            int curr = nums[i];
            int prev = i - 1;

            while(prev>=0 && nums[prev]>curr)
            {
                nums[prev+1] = nums[prev];
                prev--;
            }
            nums[prev+1] = curr;
        }
        return nums;
    }
}


