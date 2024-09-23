33. Search in Rotated Sorted Array

Time Complexity : O(log n).
Space Complexity : O(1).

class Solution 
{
    public int search(int[] nums, int target) 
    {
        int n = nums.length;
        int left = 0, right = n - 1;
        // Finding the pivot element
        while (left < right) 
        {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) 
            {
                left = mid + 1;
            } 
            else 
            {
                right = mid;
            }
        }
        int pivot = left;
        left = 0;
        right = n - 1;

        if (target >= nums[pivot] && target <= nums[right]) 
        {
            left = pivot;
        } 
        else 
        {
            right = pivot - 1;
        }
        //Binary search
        while (left <= right) 
        {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) 
            {
                return mid;
            } 
            else if (nums[mid] < target) 
            {
                left = mid + 1;
            } 
            else 
            {
                right = mid - 1;
            }
        }
        return -1; 
    }
}
