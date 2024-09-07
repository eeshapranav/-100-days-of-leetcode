3. Longest Substring Without Repeating Characters

Time Complexity: O(n).
Space Complexity: O(min(n,m)).

class Solution 
{
    public int lengthOfLongestSubstring(String s) 
  {
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int left = 0; 
        int maxLength = 0; 

        for (int right = 0; right < s.length(); right++) 
        {
            char currentChar = s.charAt(right);

            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= left) 
            {
                left = charIndexMap.get(currentChar) + 1;
            }
            charIndexMap.put(currentChar, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
