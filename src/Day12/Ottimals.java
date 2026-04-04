package Day12;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;

public class Ottimals {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> bucket = new HashMap<>();
        bucket.put(0, 1);
        int preSum = 0;
        int count = 0;
        for (int num : nums) {
            preSum += num;

            if (bucket.containsKey(preSum - k)) {
                count += bucket.get(preSum - k);
            }

            bucket.put(preSum, bucket.getOrDefault(preSum, 0) + 1);
        }
        return count;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        res.add(new ArrayList<>(temp));
        if (numRows == 1) {
            return res;
        }
        temp.add(1);
        res.add(new ArrayList<>(temp));
        if (numRows == 2) {
            return res;
        }

        for (int i = 2; i < numRows; i++) {
            List<Integer> tep = new ArrayList<>();
            tep.add(1);
            for (int j = 1; j < i; j++) {
                int leftTop = res.getLast().get(j - 1);
                int rightTop = res.getLast().get(j);

                tep.add(leftTop + rightTop);
            }
            tep.add(1);
            res.add(new ArrayList<>(tep));
        }
        return res;
    }

    public static void main(String[] args) {
        Ottimals op = new Ottimals();
        List<List<Integer>> res = op.generate(30);
        for (int i = 0; i < res.size(); i++) {
            System.out.print("[ ");
            for (Integer num : res.get(i)) {
                System.out.print(num + ",");
            }
            System.out.print("]");
            System.out.println();
        }

    }
}
