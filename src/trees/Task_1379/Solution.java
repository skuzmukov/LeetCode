package trees.Task_1379;

import utils.TreeNode;
//https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/
public class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return search(cloned, target);
    }

    TreeNode search(TreeNode clone, TreeNode target) {
        if (clone == null || clone.val == target.val) {
            return clone;
        }
        TreeNode node = search(clone.left, target);
        if (node != null) { return node; }
        node = search(clone.right, target);
        return node;
    }
}