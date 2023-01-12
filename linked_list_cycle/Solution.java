package linked_list_cycle;

public class Solution {

    public static void main(String[] args) {
        ListNode ln3 = new ListNode(3);
        ListNode ln2 = new ListNode(2);
        ListNode ln0 = new ListNode(0);
        ListNode ln4 = new ListNode(-4);
        ln4.next = ln2;
        ln3.next = ln2;
        ln2.next = ln0;
        ln0.next = ln4;

        ListNode lnn1 = new ListNode(1);
        lnn1.next = new ListNode(2);
        System.out.println(hasCycle(ln3));

    }

    // head = [3,2,0,-4], pos = 1
    public static boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast!=null && fast.next!=null && slow!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
