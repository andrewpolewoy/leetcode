package reverse_linked_list;

import java.util.ArrayList;
import java.util.List;

/*
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
 */
public class Solution {
    ListNode ln5 = new ListNode(5, null);
    ListNode ln4 = new ListNode(4, ln5);
    ListNode ln3 = new ListNode(3, ln4);
    ListNode ln2 = new ListNode(2, ln3);
    ListNode ln1 = new ListNode(1, ln2);

    //    List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode = solution.reverseList(solution.ln1);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public ListNode reverseList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode node = null;
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        for (Integer integer : list) {
            node = new ListNode(integer, node);
        }
        return node;
    }
}
