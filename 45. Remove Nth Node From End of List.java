19. Remove Nth Node From End of List

Time Complexity : O(n).
Space Complexity : O(1).

class Solution 
{
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        ListNode temp = head;
        int size = 0;

        while(temp != null)
        {
            temp = temp.next;
            size++;
        }
        if(n==size)
        {
            return head.next;
        }
        else
        {
            ListNode prev = head;
            int itoidx = size - n;

            for(int i=1; i<itoidx; i++)
            {
                prev = prev.next;
            }
            prev.next = prev.next.next;
            return head;
        }  
    }
}
