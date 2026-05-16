# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def height(self, root):
        if not root:
            return 0
        
        if not root.left:
            return 1 + self.height(root.right)
        
        if not root.right:
            return 1 + self.height(root.left)
        
        return 1 + min(self.height(root.left), self.height(root.right))

    def minDepth(self, root: Optional[TreeNode]) -> int:
        return self.height(root)
