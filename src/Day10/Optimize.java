package Day10;

public class Optimize {
    public int maxProfit(int[] prices) {
        int maxProfit =  0;
        int n = prices.length;
        int buyingPrice = prices[0];
        for (int i = 1; i < n; i++) {
           if (buyingPrice < prices[i]) {
               maxProfit = Math.max((prices[i] - buyingPrice), maxProfit);
           }else {
               buyingPrice = prices[i];
           }
        }

        return maxProfit;
    }
}
