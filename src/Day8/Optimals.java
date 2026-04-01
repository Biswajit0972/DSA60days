package Day8;

import java.util.Arrays;
import java.util.HashMap;

public class Optimals {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> bucket = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (bucket.containsKey(complement)) {
                return new int [] {bucket.get(complement), i};
            }

            bucket.put(nums[i], i);
        }
        return new int [] { -1, -1};
    }

    public void sortColors (int [] nums) {
        int [] count = new int [3];

        for (int i =0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        int k = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] != 0) {
                nums[k++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int [] colors = {0,1,0,1,2,2, 1};
        Optimals op = new Optimals();
        op.sortColors(colors);
        System.out.println(Arrays.toString(colors));
    }
}
