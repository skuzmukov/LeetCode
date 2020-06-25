package trees.Task_1315;

import utils.TreeNode;

//https://leetcode.com/problems/sum-of-nodes-with-even-valued-grandparent/
public class Solution {

    int sum = 0;

    public int sumEvenGrandparent(TreeNode root) {
        sumEvenGrandparentTraverse(null, null, root);
        return sum;
    }

    void sumEvenGrandparentTraverse(TreeNode g, TreeNode p, TreeNode c) {
        if (c == null) { return; }
        sumEvenGrandparentTraverse(p, c, c.left);
        if (g != null && g.val % 2 == 0) { sum += c.val;}
        sumEvenGrandparentTraverse(p, c, c.right);
    }

}