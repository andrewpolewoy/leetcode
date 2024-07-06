package merge_two_sorted_lists;


/*
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
 */
public class Solution {
    //    List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        ListNode ln3 = new ListNode(4, null);
        ListNode ln2 = new ListNode(2, ln3);
        ListNode list1 = new ListNode(1, ln2);

        ListNode lnn3 = new ListNode(4, null);
        ListNode lnn2 = new ListNode(3, lnn3);
        ListNode list2 = new ListNode(1, lnn2);

        ListNode listNode = mergeTwoLists(list1, list2);

        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = null;
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        } else if (list1.val < list2.val) {
            result = list1;
            result.next = mergeTwoLists(list1.next, list2);
            return result;
        } else {
            result = list2;
            result.next = mergeTwoLists(list1, list2.next);
            return result;
        }
    }
}
