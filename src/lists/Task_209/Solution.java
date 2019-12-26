package lists.Task_209;


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {return null;}
        ListNode newHead = new ListNode(head.val);
        ListNode temp = head.next;
        ListNode x;
        while(temp != null) {
            x = new ListNode(temp.val);
            x.next = newHead;
            newHead = x;
            temp = temp.next;
        }
        return newHead;
    }
}