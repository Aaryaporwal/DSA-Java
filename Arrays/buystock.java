
/*
 * Problem: Best Time to Buy and Sell Stock
 *
 * Approach:
 * - Traverse the array only once while keeping track of the minimum buying
 *   price encountered so far.
 * - If the current price is lower than the minimum buying price, update the
 *   buying price.
 * - Otherwise, calculate the profit by selling at the current price.
 * - Compare the current profit with the maximum profit obtained so far and
 *   update it if necessary.
 * - Return the maximum profit after completing the traversal.
 *
 * Algorithm:
 * 1. Initialize:
 *      buy = Integer.MAX_VALUE
 *      maxProfit = 0
 * 2. Traverse the array:
 *      a) If current price < buy:
 *            buy = current price
 *      b) Else:
 *            profit = current price - buy
 *            maxProfit = Math.max(maxProfit, profit)
 * 3. Return maxProfit.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input : [7, 1, 5, 3, 6, 4]
 * Output: 5
 *
 * Explanation:
 * Buy the stock at price 1 and sell it at price 6.
 * Maximum Profit = 6 - 1 = 5.
 */


public class BuyStock {

    public static int sellBuyStock(int[] nums) {
        int buy = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < buy) {
                buy = nums[i];
            } else {
                int profit = nums[i] - buy;
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit: " + sellBuyStock(nums));
    }
}
