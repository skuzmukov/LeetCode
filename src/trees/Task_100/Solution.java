package trees.Task_100;

import utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // ArrayDeque return NPE if the added element is null
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode f;
        TreeNode s;

        queue.add(p);
        queue.add(q);
        while (!queue.isEmpty()) {
            f = queue.poll();
            s = queue.poll();
            if (f == null && s == null) { continue; }
            // f != null & s == null || f == null & s != null -> f ^ s
            if (f == null ^ s == null || f.val != s.val) {
                return false;
            }
            queue.add(f.left);
            queue.add(s.left);
            queue.add(f.right);
            queue.add(s.right);
        }
        return true;
    }
}