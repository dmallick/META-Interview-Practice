/** 
 * 
 * Solution is loop through each day, keep track of min proce for the stock and then calulate the profit. Update profit as required
*/
public class BestTime2SellStock {

    public int highestProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        // looping for each days
        for (int price : prices) {

            // Keep track of minimum price so far
            if (price < minPrice) {
                minPrice = price;
            }
            else {
                // Calculate profit
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
