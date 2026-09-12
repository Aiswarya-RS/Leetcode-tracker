// Last updated: 12/09/2026, 14:55:22
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode partition(ListNode head, int x) {
13        ListNode slist = new ListNode();
14        ListNode blist = new ListNode();
15        ListNode small = slist;
16        ListNode big = blist;
17
18        while (head != null) {
19            if (head.val < x) {
20                small.next = head;
21                small = small.next;
22            } else {
23                big.next = head;
24                big = big.next;
25            }
26
27            head = head.next;
28        }
29
30        small.next = blist.next;
31        big.next = null;
32
33        return slist.next;        
34    }
35}