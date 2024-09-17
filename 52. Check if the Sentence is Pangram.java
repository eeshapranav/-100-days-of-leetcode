1832. Check if the Sentence is Pangram

Time Complexity : O(n).
Space Complexity : O(1).

class Solution 
{
    public boolean checkIfPangram(String sentence) 
    {
        boolean[] alpha = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) 
        {
            alpha[sentence.charAt(i) - 'a'] = true;
        }
        for (int j = 0; j < 26; j++) 
        {
            if (!alpha[j]) 
            {
                return false;
            }
        }
        return true;
    }
}
