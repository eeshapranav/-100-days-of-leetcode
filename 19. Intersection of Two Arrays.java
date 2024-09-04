349. Intersection of Two Arrays

Time Complexity: O(nlogn+mlogm+n+m).
Space Complexity: O(min(n,m)).

class Solution 
{
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
    
        int i = 0;
        int j = 0;
        List<Integer> Intersection = new ArrayList<>();

        while(i < nums1.length && j < nums2.length)
        {
            if(nums1[i] < nums2[j])
            {
                i++;
            }
            else if(nums2[j] < nums1[i])
            {
                j++;
            }
            else
            {
                if (Intersection.isEmpty() || !Intersection.get(Intersection.size() - 1).equals(nums1[i])) {
                    Intersection.add(nums1[i]);
                }
                i++;
                j++;
            }
        }
        int result[] = new int[Intersection.size()];
        for(int k = 0; k < Intersection.size(); k++)
        {
            result[k] = Intersection.get(k);
        }
        return result;    
    }
}
