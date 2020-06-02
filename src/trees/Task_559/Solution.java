package trees.Task_559;

import utils.Node;
//https://leetcode.com/problems/maximum-depth-of-n-ary-tree/
public class Solution {
    public int maxDepth(Node root) {
        return depth(root);
    }

    int depth(Node root) {
        if (root == null) { return 0; }
        int max = 1;
        for (Node node : root.children) {
            int d = 1 + depth(node);
            if (max < d) {
                max = d;
            }
        }
        return max;
    }
}