443. String Compression

Time Complexity: O(n).
Space Complexity: O(n).

class Solution 
{
    public int compress(char[] chars) 
    {
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for(int i=0; i<chars.length; i++)
        {
            char c = chars[i];

            while(i<chars.length-1 && chars[i]==chars[i+1])
            {
                count++;
                i++;
            }
            sb.append(c);
            if(count>1)
            {
                sb.append(count);
            }
            count = 1;
        }
        String compStr = sb.toString();
        char[] compCh = compStr.toCharArray();

        for(int i=0; i<compCh.length; i++)
        {
           chars[i] = compCh[i];
        }
        return compCh.length;
    }
}


