509. Fibonacci Number

Time Complexity : O(2^n).
Space Complexity : O(n).

class Solution 
{
    public int fib(int n) 
    {
        if(n==0 || n==1)
        {
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }
}
