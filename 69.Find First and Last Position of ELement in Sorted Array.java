34. Find First and Last Position of Element in Sorted Array

Time Complexity : O(n).
Space Complexity : O(log n).

class Solution 
{
    public int findFirst(int[] nums, int target, int i) 
    {
        if (i == nums.length) 
        {
            return -1;
        }
        if (nums[i] == target && (i == 0 || nums[i - 1] != target)) 
        {
            return i;
        }
        return findFirst(nums, target, i + 1);
    }

    public int findLast(int[] nums, int target, int i) 
    {
        if (i == nums.length) 
        {
            return -1;
        }
        if (nums[i] == target && (i == nums.length - 1 || nums[i + 1] != target)) 
        {
            return i;
        }
        return findLast(nums, target, i + 1);
    }

    public int[] searchRange(int[] nums, int target) 
    {
        if (nums.length == 0) 
        {
            return new int[]{-1, -1};
        }
        int start = findFirst(nums, target, 0);
        if (start == -1) 
        {
            return new int[]{-1, -1};
        }
        int end = findLast(nums, target, start);
        return new int[]{start, end};
    }
}
