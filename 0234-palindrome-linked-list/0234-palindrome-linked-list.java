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
    public boolean isPalindrome(ListNode head)
     {
            ListNode slow= head;
            ListNode fast=head;
            while(fast.next!=null && fast.next.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
            }

            ListNode curr=slow.next;
            ListNode prev=null;
            ListNode next=null;
            while(curr!=null)
            {
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            ListNode first=head;
            ListNode second=prev;
            while(second!=null)
            {
                if(first.val!=second.val)
                return false;
                first=first.next;
                second=second.next;
            }
            return true;
    }
}