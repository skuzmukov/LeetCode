package trees.Task_101;

import utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        queue.add(root);
        TreeNode f;
        TreeNode s;
        while (!queue.isEmpty()) {
            f = queue.poll();
            s = queue.poll();
            if (f == null && s == null) { continue; }
            if (f == null || s == null || f.val != s.val) {
                return false;
            }
            queue.add(f.left);
            queue.add(s.right);
            queue.add(f.right);
            queue.add(s.left);
        }
        return true;
    }
}