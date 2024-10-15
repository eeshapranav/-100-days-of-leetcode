3005. Count Elements With Maximum Frequency

Time Complexity : O(n).
Space Complexity : O(1).

import java.util.HashMap;
class Solution 
{
    public int maxFrequencyElements(int[] nums) 
    {
        int n = nums.length;
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < n; i++) 
        {
            int num = nums[i];
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        int maxfreq = 0;
        for (Integer key : freqMap.keySet()) 
        {
            int freq = freqMap.get(key);
            if (freq > maxfreq) 
            {
                maxfreq = freq;
            }
        }
        int totalMaxFreqElements = 0;
        for (Integer key : freqMap.keySet()) 
        {
            if (freqMap.get(key) == maxfreq) 
            {
                totalMaxFreqElements += freqMap.get(key);
            }
        }
        return totalMaxFreqElements;
    }
}
