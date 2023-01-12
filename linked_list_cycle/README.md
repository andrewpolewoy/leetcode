#141. Linked List Cycle
<br><b>Easy</b>

Given head, the head of a linked list, determine if the linked list has a cycle in it.<br>
There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.<br>
Return true if there is a cycle in the linked list. Otherwise, return false.<br>

<b>Example 1:<br>
![img.png](img.png)<br>
Input: head = [3,2,0,-4], pos = 1<br>
Output: true<br>
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).<br>

Example 2:<br>
![img_1.png](img_1.png)<br>
Input: head = [1,2], pos = 0<br>
Output: true<br>
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.<br>

Example 3:<br>
![img_2.png](img_2.png)<br>
Input: head = [1], pos = -1<br>
Output: false<br>
Explanation: There is no cycle in the linked list.<br>

Constraints:<br>
The number of the nodes in the list is in the range [0, 104].<br>
-105 <= Node.val <= 10 to the 5th power<br>
pos is -1 or a valid index in the linked-list.<br>

Follow up: Can you solve it using O(1) (i.e. constant) memory?
