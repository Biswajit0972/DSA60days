package Day9;

import java.util.HashMap;
import java.util.Map;

public class Optimal {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> bucket = new HashMap<>();
        for (int num : nums) {
            bucket.put(num, bucket.getOrDefault(num, 0) + 1);
        }

        for  (Map.Entry<Integer, Integer> entry : bucket.entrySet()) {
            int getValue = entry.getValue();
            int getKey = entry.getKey();

            if (getValue > nums.length/2) return getKey;
        }

        return -1;
    }

}
