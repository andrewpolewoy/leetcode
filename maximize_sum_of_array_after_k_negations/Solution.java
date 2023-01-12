package maximize_sum_of_array_after_k_negations;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {2,-3,-1,5,-4};
        int k = 2;
        System.out.println((largestSumAfterKNegations(arr,k)));
    }

    public static int largestSumAfterKNegations(int[] nums, int k) {
        while (k != 0) {
            int minEl = Arrays.stream(nums).min().getAsInt();
            int index = indexOf(nums, minEl,0);
            nums[index] = -minEl;
            k -=1;
        }
        return Arrays.stream(nums).sum();
    }
    public static int indexOf(int[] array, int valueToFind, int startIndex) {
        if (array == null) {
            return -1;
        } else {
            if (startIndex < 0) {
                startIndex = 0;
            }

            for(int i = startIndex; i < array.length; ++i) {
                if (valueToFind == array[i]) {
                    return i;
                }
            }

            return -1;
        }
    }
}
