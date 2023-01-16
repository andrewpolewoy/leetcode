package search_in_rotated_sorted_array;

/**
 * (1 <= k < nums.length)
 * [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
 * <p>
 * [0,1,2,4,5,6,7] k=3  [4,5,6,7,0,1,2].
 * <p>
 * [0,1,2,3,4,5,6,7]  k=1 [1,2,3, 4 , 5, 6 ,7,0]
 * <p>
 * [0,1,2,3,4,5,6,7]  k=5 [5, 6 ,7, 0,  1  ,2,3,4]
 * [0,1,2,3,4,5,6,7]  k=5 [5,6,7,0,1,2,3,4]
 * [0,1,2,3,4,5,6,7]  k=5 [5,6,7,0,1,2,3,4]
 * <p>
 * [0,1,2,3,4,5,6,7]  k=7 [7 , 0 ,1,  2  ,3,4,5,6]
 */
public class Solution {
    public static void main(String[] args) {
//        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
//        int target = 4;
//        int[] nums = new int[]{3,1};
//        int target = 1;
//        int[] nums = new int[]{3,5,1};
//        int target = 5;
        int[] nums = new int[]{1,3};
        int target = 4;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        if (nums[0] > nums[nums.length - 1]) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > nums[i + 1]) {
                  int result = binary(nums, 0, i , target);
                    return (result == -1) ? binary(nums, i+1, nums.length - 1, target) : result;
                }
            }
        }
        return binary(nums, 0, nums.length - 1, target);
    }

    public static int binary (int[] nums, int start, int end, int target) {
        if (nums.length == 0) return -1;
        if (nums.length == 1) return (nums[0] == target) ? 0 : -1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                start = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }
}
