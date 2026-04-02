package Day10;

import java.util.ArrayList;

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

    public ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length - 1;

        int rightGreater = arr[n];
        res.addFirst(rightGreater); // last element is always a leader

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > rightGreater) {
                rightGreater = arr[i];
                res.addFirst(arr[i]); // ✅ correct
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Optimize op = new Optimize();
        for (Integer n : op.leaders(new int[] {16,17,4,3,5,2})) {
            System.out.print(n + " ");
        }
    }
}
