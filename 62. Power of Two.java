231. Power of Two

Time complexity : O(log n).
Space complexity : O(log n).

class Solution 
{
    public boolean isPowerOfTwo(int n) 
    {
        if(n==0)
        {
            return false;
        }
        else if(n==1 || n%2==0 && isPowerOfTwo(n/2))
        {
            return true;
        }
    return false;    
    }
}
