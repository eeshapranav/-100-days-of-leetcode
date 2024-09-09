78. subsets

Time Complexity: O(n⋅2^n).
Space Complexity: O(n⋅2^n).

class Solution 
{
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> subset = new ArrayList<>();
        subset.add(new ArrayList<>());

        for(int i = 0; i<nums.length; i++)
        {
            int size = subset.size();
            
            for(int j = 0; j<size; j++)
            {
                List<Integer> newSubset = new ArrayList<>(subset.get(j));
                newSubset.add(nums[i]);
                subset.add(newSubset);
            }
        }
        return subset;
    }
}
