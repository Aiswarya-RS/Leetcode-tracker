// Last updated: 09/07/2026, 09:17:37
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean uni(TreeNode root, int val) {
        if(root==null) return true;
        if(root.val!=val) return false;
        boolean l=uni(root.left, val);
        boolean r=uni(root.right, val);
        return (l && r);
    }
    public boolean isUnivalTree(TreeNode root)
    {
        int val=root.val;
        return uni(root,val);
    }
}