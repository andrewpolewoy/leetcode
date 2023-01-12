<b>#74. Search a 2D Matrix</b>
<br><b>Medium</b>

You are given an m x n integer matrix matrix with the following two properties:<br>

Each row is sorted in non-decreasing order.<br>
The first integer of each row is greater than the last integer of the previous row.<br>
Given an integer target, return true if target is in matrix or false otherwise.<br>

You must write a solution in O(log(m * n)) time complexity.<br>

<b>Example 1:</b><br>
![img.png](img.png)<br>
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3<br>
Output: true<br>

<b>Example 2:</b><br>
![img_1.png](img_1.png)<br>
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13<br>
Output: false<br>

<b>Constraints:</b><br>
m == matrix.length<br>
n == matrix[i].length<br>
1 <= m, n <= 100<br>
-10 to the 4th power <= matrix[i][j], target <= 10 to the 4th power<br>



