package trees.Task_617;

import utils.TreeNode;

public class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        return merge(t1, t2);
    }

    TreeNode merge(TreeNode t1, TreeNode t2) {
        if (t1 == null) { return t2; }
        if (t2 == null) { return t1; }
        TreeNode n = new TreeNode(t1.val + t2.val);
        n.left = merge(t2.left, t1.left);
        n.right = merge(t2.right, t1.right);
        return n;
    }
}