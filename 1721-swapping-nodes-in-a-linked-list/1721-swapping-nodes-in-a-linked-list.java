/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution 
{
    public ListNode swapNodes(ListNode head, int k) 
    {
    
      if (head == null) return null;
        
        ListNode curr = head, curr1 = head, curr2 = head;
        int len = 0;
        for (int i = 1; i < k; i++) 
        {
            curr1 = curr1.next;
        }
    
        while (curr != null)
         {
            curr = curr.next;
            len++;
        }
        
        for (int i = 0; i < len - k; i++) 
        {
            curr2 = curr2.next;
        }

        int temp = curr1.val;
        curr1.val = curr2.val;
        curr2.val = temp;
        
        return head;


   }
}
