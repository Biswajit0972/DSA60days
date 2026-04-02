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

    public int[] rearrangeArray(int[] nums) {
        int pos= 0;
        int neg = 1;
        int [] res = new int[nums.length];

        for (int num :  nums) {
            if (num > 0) {
                res[pos] = num;
                pos+=2;
            }else {
                res[neg] = num;
                neg+= 2;
            }
        }

        return res;
    }
}
