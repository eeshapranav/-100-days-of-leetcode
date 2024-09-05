13. Roman to Integer

Time Complexity: O(n).
Space Complexity: O(1).

class Solution 
{
    public int romanToInt(String s) 
    {
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) 
        {
            char currentChar = s.charAt(i);
            int currentValue = roman.get(currentChar);

            if (currentValue < prevValue) 
            {
                result -= currentValue; 
            } 
            else 
            {
                result += currentValue; 
            }
            prevValue = currentValue; 
        }
        return result;
    }
}


