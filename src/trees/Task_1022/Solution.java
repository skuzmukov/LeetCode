package trees.Task_1022;

import utils.TreeNode;

//https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
public class Solution {
    int sum = 0;
    public int sumRootToLeaf(TreeNode root) {
        if (root == null) { return 0; }
        sum(root, new StringBuilder());
        return sum;
    }

    private void sum(TreeNode root, StringBuilder sb) {
        sb.append(root.val);
        if (root.left == null && root.right == null) {
            sum += Integer.parseInt(sb.toString(), 2);
        }
        if (root.left != null) { sum(root.left, sb); }
        if (root.right != null) { sum(root.right, sb); }

        sb.setLength(sb.length() - 1);
    }
}