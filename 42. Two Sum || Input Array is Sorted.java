167. Two Sum || Input Array is Sorted

Time Complexity : O(n).
Space Complexity : O(1).

class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
        int lp = 0;
        int rp = numbers.length - 1;

        while (lp < rp) 
        {
            int sum = numbers[lp] + numbers[rp]; 

            if (sum == target) 
            { 
                return new int[]{lp + 1, rp + 1}; 
            } 
            else if (sum < target) 
            { 
                lp++;
            } 
            else 
            { 
                rp--;
            }
        }
        return new int[]{}; 
    }
}
