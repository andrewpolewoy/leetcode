<b>#33. Search in Rotated Sorted Array</b>
<br><b>Medium</b>

There is an integer array nums sorted in ascending order (with distinct values).<br>

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].<br>

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.<br>

You must write an algorithm with O(log n) runtime complexity.<br>

<b>Example 1:</b><br>
Input: nums = [4,5,6,7,0,1,2], target = 0<br>
Output: 4<br>

<b>Example 2:</b><br>
Input: nums = [4,5,6,7,0,1,2], target = 3<br>
Output: -1<br>

<b>Example 3:</b><br>
Input: nums = [1], target = 0<br>
Output: -1<br>

<b>Constraints:</b><br>
1 <= nums.length <= 5000<br>
-10 to the 4th power <= nums[i] <= 10 to the 4th power<br>
All values of nums are unique.<br>
nums is an ascending array that is possibly rotated.<br>
-10 to the 4th power <= target <= 10 to the 4th power


