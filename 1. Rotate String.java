796. Rotate String

Time Complexity: O(n).
Space Complexity: O(n).

class Solution 
{
    public boolean rotateString(String s, String goal) 
    {
        return s.length() == goal.length() && (s+s).contains(goal);
    }

    public static void main(String[] args) {
        Solution solution = new Solution(); 
        
        String s = "abcde";
        String goal = "cdeab";
        
        if (solution.rotateString(s, goal)) 
        {
            System.out.println("true");
        } 
        else 
        {
            System.out.println("false");
        }
    }
}
