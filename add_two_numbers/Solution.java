package add_two_numbers;


public class Solution {
    //Input: l1 = [2,4,3], l2 = [5,6,4]
    //Output: [7,0,8]
    //Explanation: 342 + 465 = 807.
    public static void main(String[] args) {
//        ListNode ln3 = new ListNode(3, null);
//        ListNode ln4 = new ListNode(4, ln3);
//        ListNode ln2 = new ListNode(2, ln4);
//
//        ListNode lnn4 = new ListNode(4, null);
//        ListNode lnn6 = new ListNode(6, lnn4);
//        ListNode lnn5 = new ListNode(5, lnn6);
//
//        System.out.println(addTwoNumbers(ln2, lnn5));

//        ListNode ln6 = new ListNode(6, null);
//        ListNode ln5 = new ListNode(5, ln6);
//
//        ListNode lnn9 = new ListNode(9, null);
//        ListNode lnn4 = new ListNode(4, lnn9);
//        ListNode lnn5 = new ListNode(5, lnn4);
//
//        System.out.println(addTwoNumbers(ln5, lnn5));

//        ListNode ln5 = new ListNode(5);
//        ListNode lnn5 = new ListNode(5);
//        System.out.println(addTwoNumbers(ln5, lnn5));
        ListNode ln9 = new ListNode(9);
        ListNode lnn9 = new ListNode(9, ln9);
        ListNode lnnn9 = new ListNode(9, lnn9);
        ListNode lnnnn9 = new ListNode(9, lnnn9);
        ListNode lnnnnn9 = new ListNode(9, lnnnn9);
        ListNode lnnnnnn9 = new ListNode(9, lnnnnn9);
        ListNode lnnnnnnn9 = new ListNode(9, lnnnnnn9);
        ListNode lnnnnnnnn9 = new ListNode(9, lnnnnnn9);
        ListNode lnnnnnnnnn9 = new ListNode(9, lnnnnnnn9);
        ListNode ln1 = new ListNode(1, lnnnnnnnnn9);

        ListNode l9 = new ListNode(9);

        Solution solution = new Solution();
        System.out.println(solution.addTwoNumbers(ln1, l9));

    }
    public ListNode resList = new ListNode(0);
    public ListNode head = resList;
    public int carry = 0;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int sum = l1.val + l2.val + carry;
        carry  = sum / 10;
        resList.next = new ListNode(sum % 10);
        resList = resList.next;

        if(l1.next != null && l2.next != null)
            addTwoNumbers(l1.next, l2.next);
        else if (l1.next != null)
            addTwoNumbers(l1.next, new ListNode(0));
        else if (l2.next != null)
            addTwoNumbers(new ListNode(0), l2.next);
        else if (carry > 0)
        {
            resList.next = new ListNode(1);
            resList = resList.next;
        }
        return head.next;
    }
}