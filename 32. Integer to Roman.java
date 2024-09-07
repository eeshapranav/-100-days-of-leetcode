12. Integer to Roman

Time Complexity: O(1).
Space Complexity: O(1).

class Solution 
{
    public String intToRoman(int num) 
    {
        int[] numero = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numero.length; i++) 
        {
            while (num >= numero[i]) 
            {
                sb.append(symbols[i]); 
                num -= numero[i]; 
            }
        }
        return sb.toString(); 
    }
}
