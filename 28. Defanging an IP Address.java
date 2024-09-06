1108. Defanging an IP Address

Time Complexity: O(n).
Space Complexity: O(n).

class Solution 
{
    public String defangIPaddr(String address) 
    {
        StringBuilder defangedIP = new StringBuilder();
        for(int i=0; i<address.length(); i++)
        {
            if(address.charAt(i)=='.')
            {
                System.out.println(defangedIP.append("[.]"));
            }
            else
            {
                System.out.println(defangedIP.append(address.charAt(i)));
            }
        }
        return defangedIP.toString();
    }
}
