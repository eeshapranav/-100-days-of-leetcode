205. Isomorphic Strings

Time Complexity : O(n).
Space Complexity : O(n).

class Solution 
{
    public boolean isIsomorphic(String s, String t) 
    {
        if (s.length() != t.length()) 
        {
            return false;
        }
        Map<Character, Character> sToT = new HashMap<>();
        Map<Character, Character> tToS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) 
        {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (sToT.containsKey(charS)) 
            {
                if (sToT.get(charS) != charT) 
                {
                    return false;
                }
            } 
            else 
            {
                sToT.put(charS, charT);
            }
            if (tToS.containsKey(charT)) 
            {
                if (tToS.get(charT) != charS) 
                {
                    return false;
                }
            } 
            else 
            {
                tToS.put(charT, charS);
            }
        }
        return true;
    }
}
