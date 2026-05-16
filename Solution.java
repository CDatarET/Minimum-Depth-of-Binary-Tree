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
    private int height(TreeNode root){
        if(root == null){
            return(0);
        }

        int left = height(root.left);
        int right = height(root.right);
        
        if(left == 0){
            return(1 + right);
        }

        if(right == 0){
            return(1 + left);
        }

        return(1 + Math.min(left, right));
    }

    public int minDepth(TreeNode root) {
        return(height(root));
    }
}
