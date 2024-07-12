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
    public ListNode oddEvenList(ListNode head) 
    {
        ListNode oddstart=null;
        ListNode evenstart=null;
        ListNode evenend=null;
        ListNode oddend=null;
        ListNode temp=null;
        ListNode curr=head;
        int count=1;
        while(curr!=null)
        {
            if(count%2!=0)
            {
                if(oddstart==null)
                  oddstart=oddend=curr;
                else
                 {
                    oddend.next=curr;
                    oddend=oddend.next;
                 }
            }
            else
            {
             if(evenstart==null)
                  evenstart=evenend=curr;
                else
                 {
                    evenend.next=curr;
                    evenend=evenend.next;
                 }   
            }
            count++;
            curr=curr.next;
       }
        if (oddend != null) 
        oddend.next = evenstart;
    if (evenend != null) 
        evenend.next = null;
    
    return oddstart != null ? oddstart : evenstart;
    }
}