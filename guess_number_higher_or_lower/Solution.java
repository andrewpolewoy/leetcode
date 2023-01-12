package guess_number_higher_or_lower;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.guessNumber(10));
    }

    int start = 0, finish = 0, middle = 0, guess = 12;

    public int guessNumber(int n) {
        int low = 0, high = n;
        while (low <= high) {
            middle = low + (high - low) / 2;
            guess = guess(middle);
            if (guess == 0) return middle;
            if (guess == -1) {     // < -
                high = middle - 1;
            }
            if (guess == 1) {    //  - >
                low = middle + 1;
            }
        }
        return 0;
    }

    int getMiddle(int start, int finish) {
        return start + (finish - start) / 2;
    }

    int guess(int num) {
        if (num == 2) return 0;
        return (num > 2) ? -1 : 1;
    }
}
