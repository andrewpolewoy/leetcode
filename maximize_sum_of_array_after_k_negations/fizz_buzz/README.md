#1005. Maximize Sum Of Array After K Negations
<br><b>Easy</b>

Given an integer array nums and an integer k, modify the array in the following way:<br>
choose an index i and replace nums[i] with -nums[i].<br>
You should apply this process exactly k times. You may choose the same index i multiple times.<br>
Return the largest possible sum of the array after modifying it in this way.<br>

<b>Example 1:<br>
Input: nums = [4,2,3], k = 1<br>
Output: 5<br>
Explanation: Choose index 1 and nums becomes [4,-2,3].<br>

Example 2:<br>
Input: nums = [3,-1,0,2], k = 3<br>
Output: 6<br>
Explanation: Choose indices (1, 2, 2) and nums becomes [3,1,0,2].<br>

Example 3:<br>
Input: nums = [2,-3,-1,5,-4], k = 2<br>
Output: 13<br>
Explanation: Choose indices (1, 4) and nums becomes [2,3,-1,5,4].<br>

Constraints:<br>
1 <= ransomNote.length, magazine.length <= 10 to the 4th power<br>
1 <= nums.length <= 10 to the 4th power<br>
-100 <= nums[i] <= 100<br>
1 <= k <= 10 to the 4th power