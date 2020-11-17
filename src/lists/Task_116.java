package lists;

//https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
public class Task_116 {
    public Node connect(Node root) {
        if (root == null) { return null; }
        Node current = root;
        Node temp;

        while (current.left != null) {
            temp = current;
            while (temp != null) {
                temp.left.next = temp.right;
                if (temp.next != null) {
                    temp.right.next = temp.next.left;
                }
                temp = temp.next;
            }
            current = current.left;
        }

        return root;
    }
}


//Упростить!


class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}