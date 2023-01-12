package binary_search;

/*
Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] num = {-1, 0, 3, 5, 9, 12};
        int search = solution.search(num, 5);
        System.out.println(search);
    }

    public int search(int[] nums, int target) {
        int length = nums.length;
        if (length == 0) return -1;
        if (length == 1) return (nums[0] == target) ? 0 : -1;

        int midl = length / 2;
        if (target == nums[midl]) return midl;
        if (target < nums[midl]){
            for (int i = 0; i < midl; i++) {
                if (nums[i] == target){
                    return i;
                }
            }
        }else if (target > nums[midl]){
            for (int i = midl; i < length; i++) {
                if (nums[i] == target){
                    return i;
                }
            }
        }
        return -1;
    }
}
