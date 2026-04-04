package Day12;

import java.util.HashMap;

public class Ottimals {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> bucket = new HashMap<>();
        bucket.put(0,1);
        int preSum = 0;
        int count = 0;
        for (int num : nums) {
            preSum += num;

            if (bucket.containsKey(preSum - k)) {
                count += bucket.get(preSum -k);
            }

            bucket.put(preSum, bucket.getOrDefault(preSum,  0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
