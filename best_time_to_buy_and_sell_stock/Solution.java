package best_time_to_buy_and_sell_stock;

/**
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 */
public class Solution {
    public static void main(String[] args) {

        int[] prices1 = {7,6,4,3,1};
        int result = maxProfit(prices1);

        System.out.println(result);
    }

    public static int maxProfit(int[] prices) {
        if (prices.length == 1) {
            return prices[0];
        }else {
            int minPrice = prices[0];
            int maxProfit = 0;

            for (int i = 1; i < prices.length; i++) {
                if (prices[i] < minPrice) {
                    minPrice = prices[i];
                } else if (prices[i] - minPrice > maxProfit) {
                    maxProfit = prices[i] - minPrice;
                }
            }

            return maxProfit;
        }
    }
}
