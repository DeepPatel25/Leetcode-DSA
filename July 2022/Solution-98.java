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
class Solution-98 {
    public boolean isValidBST(TreeNode root) {
        return validBst(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    public boolean validBst(TreeNode root, long a, long b){
        if(root==null) return true;
        if(root.val<=a || root.val>=b) return false;
        
        return validBst(root.left, a, root.val) && validBst(root.right, root.val, b);
    }
}