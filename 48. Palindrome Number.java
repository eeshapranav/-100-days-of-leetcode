9. Palindrome Number

Time Complexity : O(log10(x)).
Space Complexity : O(1).

class Solution 
{
    public boolean isPalindrome(int x) 
    {
        if(x<0)
        {
            return false;
        }
        int num = x;
        int rev = 0;
        
        while(x !=0)
        {
           int LastDigit = x % 10;
           rev = rev * 10 + LastDigit;
           x = x/10;
        }
        return num==rev;
    }
}
