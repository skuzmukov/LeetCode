package lists.Task_876;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
    public ListNode middleNode(ListNode head) {

        if (head == null || head.next == null) {return head;}

        ListNode mid = head;
        ListNode tail = head;
        while (tail != null && tail.next != null) {
            tail = tail.next.next;
            mid = mid.next;
        }
        return mid;
    }
}