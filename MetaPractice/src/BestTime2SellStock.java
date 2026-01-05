/** 
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
 * Solution is loop through each day, keep track of min proce for the stock and then calulate the profit. Update profit as required

*/
public class BestTime2SellStock {

    public int highestProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        // looping for each days
        for (int price : prices) {

            // Keep track of minimum price so far. Calculate each day price, compare with the minPrice. Goal is to find the min stock price.
            if (price < minPrice) {
                minPrice = price;
            } else {
                // Calculate profit based on the minPrice of the stock found in the if block
                int profit = price - minPrice;

                // Update max profit
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        System.out.println("the Max profit is: " + maxProfit);
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] stockPrices = {7,2,5,3,9};
        BestTime2SellStock bt2s = new BestTime2SellStock();
        bt2s.highestProfit(stockPrices);

    }
}
