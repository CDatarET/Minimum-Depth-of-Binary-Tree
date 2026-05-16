public class Solution {
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

        return(1 + Math.Min(left, right));
    }

    public int MinDepth(TreeNode root) {
        return(height(root));   
    }
}
