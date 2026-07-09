// Last updated: 09/07/2026, 09:17:33
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
    public int[] nextLargerNodes(ListNode head) {
        ListNode curr=head; 
        ArrayList<Integer> al=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        while(curr!=null)
        {
            al.add(curr.val);
            curr=curr.next;
        }
        int n=al.size();

            int res[]=new int[n];
            for(int i=n-1;i>=0;i--)
            {
                int x=al.get(i);
                while(!st.empty() && x>=st.peek())
                {
                    st.pop();
                }
                if(st.empty())
                {
                    res[i]=0;
                }
                else
                {
                    res[i]=st.peek();
                }
                st.push(x);
            }
            return res;
    }
}