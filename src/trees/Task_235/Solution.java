package trees.Task_235;

import utils.TreeNode;

//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return (p.val >= q.val) ? lca(root, q.val, p.val) : lca(root, p.val, q.val);
    }

    TreeNode lca(TreeNode root, int l, int r) {
        if (l <= root.val && root.val <= r) { return root; }
        if (root.val < l) {
            return lca(root.right, l, r);
        } else {
            return lca(root.left, l, r);
        }
    }
}