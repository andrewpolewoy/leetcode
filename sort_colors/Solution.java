package sort_colors;

public class Solution {
    public static void main(String[] args) {
        int [] nums = {2,0,2,1,1,0};
        sortColors(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
    public static void sortColors(int[] nums) {
        quickSort(nums, 0, nums.length -1);
    }

    public static void quickSort(int[] nums, int low, int high){
//        int low = 0;
//        int high = nums.length;
        if (nums.length == 0 || low >= high) return;
        int middle = low + (high-low)/2;

        int border = nums[middle];
        int i = low;
        int j = high;
        while(i<=j){
            while(nums[i]<border)i++;
            while(nums[j]>border)j--;
            if(i<=j){
                int swap=nums[i];
                nums[i]=nums[j];
                nums[j]=swap;
                i++;
                j--;
            }
        }
        if(low<j)quickSort(nums,low,j);
        if(high>i)quickSort(nums,i,high);
    }

}
