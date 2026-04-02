package Day10;

import java.util.ArrayList;

public class Solutions {
    public int maxProfit(int[] prices) {
        int maxProfit =  0;
        int n = prices.length;
        for (int i = 0; i < n; i++) {
            for (int j = i +1; j < n; j++) {
                int profit = prices[j] - prices[i];
                maxProfit = Math.max(profit, maxProfit);
            }
        }

        // ! remark : 10^4 so it become 10^6 not good for all test cases. 10^8  took 1 sec to execute.

        return maxProfit;
    }

    public ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean isLeader = true;
            for (int j = i+1; j < n; j ++) {
                if (arr[i] < arr[j]) {
                    isLeader = false;
                    break;
                }
            }

            if (isLeader) res.add(arr[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        Solutions s = new Solutions();
    }
}
