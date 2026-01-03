package top100gfg;

public class BuySellStock {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        findMaxProfit(prices);
    }

    private static int findMaxProfit(int[] prices) {
        int min_price =prices[0]; //initialize for the firstday price
        int max_profit=0;    

        /* iterate through each day and find out 2 attributes:
            1. what would be the minimum proce of the stock(min_price)
            2. Profit for the day, once the min_price is found out.
            3. Once done, compare the profit, previously stored and hence find the max_profit
        */
        for(int day=0; day<prices.length; day++ ){            
            if ( prices[day] <= min_price ) {
                min_price = prices[day];            
            }
            
            int profit =  prices[day] - min_price;
            if (max_profit < profit) {
                max_profit = profit;
            }           

        }
        System.out.println("Max profit is: " + max_profit);
        return max_profit;
        
    }
}
