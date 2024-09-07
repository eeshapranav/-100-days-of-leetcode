415. Add Strings

Time Complexity: O(max(n,m)).
Space Complexity: O(max(n,m)).

class Solution 
{
    public String addStrings(String num1, String num2) 
  {
        
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        int sum = 0, carry = 0;
        StringBuilder adder = new StringBuilder();

        while (i >= 0 || j >= 0) 
        {
            sum = carry;
            if (i >= 0) 
            {
                sum += (int)num1.charAt(i) - 48;
                i--;
            }
            if (j >= 0) 
            {
                sum += (int)num2.charAt(j) - 48;
                j--;
            }
            carry = sum / 10;
            sum = sum % 10;
            adder.append(sum);
        }
        if (carry == 1) 
        {
            adder.append(1);
        }
        return adder.reverse().toString();
    }
}
