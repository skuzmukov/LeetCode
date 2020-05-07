package trees.Task_590;

import utils.Node;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<Integer>();
        return postorder(root, list);
    }
    List<Integer> postorder(Node root, List<Integer> list) {
        if (root == null) { return list; }
        for (Node n : root.children) {
            list = postorder(n, list);
        }
        list.add(root.val);
        return list;
    }
}