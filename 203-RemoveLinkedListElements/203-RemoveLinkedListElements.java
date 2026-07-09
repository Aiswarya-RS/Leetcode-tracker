// Last updated: 09/07/2026, 09:19:42
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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
        {
            return head;
        }

        ListNode dummynode= new ListNode(0);
        dummynode.next=head;

        ListNode curr=dummynode;
        while(curr.next!=null)
        {
            if(curr.next.val==val)
            {
                curr.next=curr.next.next;
            }
            else
            {
                curr=curr.next;
            }
        }
        return dummynode.next;
    }
}