package trees.Task_1008;

import utils.TreeNode;
//https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/
public class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);

        for (int i = 1; i < preorder.length; i++) {
            preorder(root, preorder[i]);
        }
        return root;
    }

    void preorder(TreeNode root, int val) {
        if (root.val < val) {
            if (root.right == null) {
                root.right = new TreeNode(val);
            } else {
                preorder(root.right, val);
            }
        } else {
            if (root.left == null) {
                root.left = new TreeNode(val);
            } else {
                preorder(root.left, val);
            }
        }
    }
}