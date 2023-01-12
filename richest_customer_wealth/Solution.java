package richest_customer_wealth;

public class Solution {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        System.out.println((maximumWealth(arr)));
    }

    public static int maximumWealth(int[][] accounts) {
        int wealthSoFar = 0;
        for (int i = 0; i < accounts.length; i++) {
            int wealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                wealth += accounts[i][j];
            }
            if (wealth > wealthSoFar) wealthSoFar = wealth;
        }
        return wealthSoFar;
    }
}
