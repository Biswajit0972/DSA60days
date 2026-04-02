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

    public int longestConsecutive(int[] nums) {
        int maxL = 0;

        for (int num : nums) {
            int count = 0;
            int el = num;
            while (isPresent(nums, el)) {
                el++;
                count++;
            }

            maxL = Math.max(maxL, count);
        }

        return maxL;
    }

    public boolean isPresent(int [] nums, int el) {
        for (int num : nums) {
            if (num == el) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        Solutions s = new Solutions();

        System.out.println(s.longestConsecutive(new int[] {100, 4, 200, 1, 3, 2}));
    }
}
