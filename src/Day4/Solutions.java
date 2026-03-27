package Day4;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    /**
    Problem:
    Given an array of integers, find the most frequent element in it
    (i.e., the element that occurs the maximum number of times).

    If there are multiple elements with the same maximum frequency,
    return the smallest among them.

    Note:
    This problem may seem difficult without prior knowledge of hashing,
    but it can be solved using basic concepts.

    Examples:

    Example 1:
    Input: arr = [1, 2, 2, 3, 3, 3]
    Output: 3
    Explanation: The number 3 appears the most (3 times).

    Example 2:
    Input: arr = [4, 4, 5, 5, 6]
    Output: 4
    Explanation: Both 4 and 5 appear twice, but 4 is smaller.

    Example 3:
    Input: arr = [10, 9, 7]
    Output: 7
    Explanation: All elements appear once, so return the smallest.
*/

    public int mostFrequentElement (int []  nums ) {
        if (nums.length == 1) {
            return nums[0];
        }

        HashMap<Integer,  Integer> bucket = new HashMap<>(); // O(n)

        for (int num : nums) {
            bucket.put(num, bucket.getOrDefault(num, 0) + 1);
        }

        int maxFreq = Integer.MIN_VALUE;
        int mostEle = Integer.MAX_VALUE;

        for (Map.Entry<Integer,  Integer> entry : bucket.entrySet()) { // O(m)
            int freq = entry.getValue();
            int key = entry.getKey();

            if (freq > maxFreq || (maxFreq == freq && mostEle > key)) {
                maxFreq = freq;
                mostEle = key;
            }
        }

        return mostEle;
    }
    public static void main(String[] args) {
        Solutions s = new Solutions();
        System.out.println(s.mostFrequentElement(new int[] {1, 2, 2, 3, 3, 3}));
    }
}
