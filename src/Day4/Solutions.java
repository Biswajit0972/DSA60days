package Day4;

import java.util.ArrayList;
import java.util.List;

public class Solutions {
    public List<Integer> frequencyCount(int[] arr) {
        List<Integer> res = new ArrayList<>();
        int [] hash = new int[arr.length]; // O(n)

        for (int num : arr) { // O(n)
            hash[num-1]++;
        }

        for (int num : hash) { // O(n)
            res.add(num);
        }

        return res;

        /*
        * Time complexity: O(2n)
        * Space: O(n) */
    }

    public static void main(String[] args) {
        Solutions s = new Solutions();
        for (Integer num : s.frequencyCount(new int[] {1})) {
            System.out.print(num + " ");
        }
    }
}
