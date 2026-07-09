// Last updated: 09/07/2026, 09:19:22
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
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        } 
        ListNode h1=head;
        ListNode h2=reverse(slow);
        while(h2!=null){
            if(h1.val!=h2.val)
            {
                return false;
            }
            h1=h1.next;
            h2=h2.next;
        }
        return true;
    }

    static ListNode reverse(ListNode head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode a=null,b=head,c=head.next;
        while(b!=null)
        {
            b.next=a;
            a=b;
            b=c;
            if(c!=null)
            {
                c=c.next;
            }
        }
        return a;
    }
}