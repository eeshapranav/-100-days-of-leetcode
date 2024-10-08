242. Valid Anagram

Time Complexity: O(nlogn).
Space Complexity: O(n).

import java.util.Arrays;
class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        if (s.length() != t.length()) 
        {
            return false;
        }

        char[] charArrayS = s.toCharArray();
        char[] charArrayT = t.toCharArray();
        Arrays.sort(charArrayS);
        Arrays.sort(charArrayT);

        return Arrays.equals(charArrayS, charArrayT);
    }
}
