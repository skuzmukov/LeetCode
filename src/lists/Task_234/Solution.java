package lists.Task_234;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {return true;}
        ListNode mid = head;
        ListNode tail = head;

        while (tail != null && tail.next != null) {
            tail = tail.next.next;
            mid = mid.next;
        }

        if (tail != null) {mid = mid.next;}

        ListNode newHead = new ListNode(mid.val);
        ListNode temp = mid.next;

        while (temp != null) {
            ListNode x = new ListNode(temp.val);
            x.next = newHead;
            newHead = x;
            temp = temp.next;
        }

        while (newHead != null) {
            if (newHead.val != head.val) {return false;}
            newHead = newHead.next;
            head = head.next;
        }
        return true;
    }
}