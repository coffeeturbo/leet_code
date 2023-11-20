package easy;

public class BestTimeToBuyAndSell {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buyDay = 0;
        for (int i = 1; i < prices.length; i++) {

            var sel = prices[i];
            if (sel > prices[buyDay]) {
                profit = Math.max(profit, sel - prices[buyDay]);

            } else {
                buyDay = i;
            }
        }


        return profit;
    }
}
