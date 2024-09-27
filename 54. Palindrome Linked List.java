234. Palindrome Linked List

Time Complexity : O(n).
Space Complexity : O(n).

class Solution 
{
    public boolean isPalindrome(ListNode head) 
    {
        Stack<Integer> stack = new Stack();
        ListNode curr = head;
        while(curr != null) 
        {
            stack.push(curr.val);
            curr = curr.next;
        }
        curr = head;
        while(curr != null && curr.val == stack.pop()) 
        {
            curr = curr.next;
        }
        return curr == null;
    }
}