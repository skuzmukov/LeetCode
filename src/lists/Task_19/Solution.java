package lists.Task_19;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) {return null;}
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        ListNode tail = fakeHead;
        ListNode nthNode = fakeHead;
        for (int i = 0; i < n + 1; i++) {
            tail = tail.next;
        }
        while (tail != null) {
            tail = tail.next;
            nthNode = nthNode.next;
        }
        nthNode.next = nthNode.next.next;

        return fakeHead.next;
    }
}