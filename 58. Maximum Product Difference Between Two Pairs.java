1913. Maximum Product Difference Between Two Pairs

Time Complexity : O(n logn).
Space Complexity : O(1).

class Solution 
{
    public int maxProductDifference(int[] nums) 
    {
        int n = nums.length;
        Arrays.sort(nums);

        int largest1 = nums[n-1];
        int largest2 = nums[n-2];
        int smallest1 = nums[0];
        int smallest2 = nums[1];

        return (largest1 * largest2) - (smallest1 * smallest2);
    }
}
