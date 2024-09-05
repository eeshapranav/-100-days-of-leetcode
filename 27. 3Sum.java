15. 3Sum

Time Complexity: O(n^2).
Space Complexity: O(n).

class Solution 
{
    public List<List<Integer>> threeSum(int[] nums) 
  {
        ArrayList<List<Integer>> arr = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) 
        {
            if (i > 0 && nums[i] == nums[i - 1]) 
            {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) 
            {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) 
                {
                    arr.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    while (j < k && nums[j] == nums[j + 1]) 
                    {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k - 1]) 
                    {
                        k--;
                    }

                    j++;
                    k--;
                } 
                else if (sum < 0) 
                {
                   j++;
                } 
                else 
                {
                   k--;
                }
            }
        }
        return arr;
    }
}
