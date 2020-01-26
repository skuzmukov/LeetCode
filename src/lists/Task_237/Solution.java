package lists.Task_237;

import utils.ListNode;

public class Solution {
    // Чтобы удалить элемент из середины связного списка, можно удаляему элементу присвоить значение след элемента
    // и перезаписать ссылку на следующий.следующий за удаляемым элемент!
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}