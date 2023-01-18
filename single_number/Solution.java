package single_number;

/*
Input: nums = [2,2,1]
Output: 1

Input: nums = [4,1,2,1,2]
Output: 4
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
//        System.out.println(4^323);
    }
    public static int singleNumber(int[] nums) {
        int unique=0;
        for(int i=0;i<=nums.length-1;i++)
        {
            unique=unique^nums[i];
        }
        return unique;
    }
}
