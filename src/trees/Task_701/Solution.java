package trees.Task_701;

import utils.TreeNode;

public class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode temp = root;
        while (temp != null) {
            if (temp.val < val) {
                if (temp.right == null) {
                    temp.right = new TreeNode(val);
                    return root;
                } else {
                    temp = temp.right;
                }
            } else {
                if (temp.left == null) {
                    temp.left = new TreeNode(val);
                    return root;
                } else {
                    temp = temp.left;
                }
            }
        }
        return new TreeNode(val);
    }
}