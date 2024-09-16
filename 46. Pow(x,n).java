50. Pow(x,n)

Time Complexity: O(1).
Space Complexity: O(1).

import java.util.Scanner;
class Solution 
{
    public double myPow(double x, int n) 
    {
        return Math.pow(x,n);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        Solution sol = new Solution();
        double result = sol.myPow(x, n);
        System.out.println("Result: " + result);
    }
}
