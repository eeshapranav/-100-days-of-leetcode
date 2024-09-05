1. Two Sum

Time Complexity: O(n).
Space Complexity: O(n).

class Solution 
{
    public int[] twoSum(int[] nums, int target) 
  {
        HashMap<Integer, Integer> anipony = new HashMap<>();

        for(int i=0; i<nums.length;i++)
        {
            anipony.put(nums[i], i);
        }
        for(int i=0;i<nums.length;i++)
        {
            int component = target-nums[i];
            if(anipony.containsKey(component) && anipony.get(component) != i)
            {
                return new int[] {i, anipony.get(component)};
            }
        }
        return null;
    }
}
