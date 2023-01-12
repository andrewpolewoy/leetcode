#872. Leaf-Similar Trees
<br><b>Easy</b>

Consider all the leaves of a binary tree, from left to right order, the values of those leaves form a leaf value sequence.<br>
![img.png](img.png)<br>
For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).<br>
Two binary trees are considered leaf-similar if their leaf value sequence is the same.<br>
Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.<br>

<b>Example 1:<br>
![img_1.png](img_1.png)<br>
Input: root1 = [3,5,1,6,2,9,8,null,null,7,4],<br>
root2 = [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]<br>
Output: true<br>

Example 2:<br>
![img_2.png](img_2.png)
Input: root1 = [1,2,3], root2 = [1,3,2]<br>
Output: false<br>

Constraints:<br>
The number of nodes in each tree will be in the range [1, 200].<br>
Both of the given trees will have values in the range [0, 200].<br>