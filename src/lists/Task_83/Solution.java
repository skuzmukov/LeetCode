package lists.Task_83;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode res = head;
        ListNode node = head;
        while (node.next != null) {
            if (node.val == node.next.val) {
                node = node.next;
            } else {
                res.next = node.next;
                res = res.next;
                node = node.next;
            }
        }
        res.next = null;
        return head;
    }
}