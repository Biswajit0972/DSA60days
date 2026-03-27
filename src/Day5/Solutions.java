package Day5;

public class Solutions {

    /**
     * Largest in Array
     * Given an array arr[]. The task is to find the largest element and return it.
     * Input: arr[] = [1, 8, 7, 56, 90]
     * Output: 90
     * Explanation: The largest element of the given array is 90.
     * <p>
     * Input: arr[] = [5, 5, 5, 5]
     * Output: 5
     * Explanation: The largest element of the given array is 5.
     * <p>
     * Input: arr[] = [10]
     * Output: 10
     * Explanation: There is only one element which is the largest.
     * <p>
     * Constraints:
     * 1 <= arr.size()<= 10^6
     * 0 <= arr[i] <= 10^6
     *
     *
     */
    public static int largest(int[] arr) {
        // code here
        if (arr.length == 1) {
            return arr[0];
        }

        int maxElement = -1;
        for (int num : arr) {
            maxElement = Math.max(maxElement, num);
        }

        return maxElement;
    }

    /**
     * Problem: Second Largest
     * <p>
     * Given an array of positive integers arr[], return the second largest element from the array.
     * If the second largest element doesn't exist then return -1. [page:1]
     * <p>
     * Note:
     * - The second largest element should not be equal to the largest element. [page:1]
     * <p>
     * Examples:
     * 1)
     * Input:  arr[] = [12, 35, 1, 10, 34, 1]
     * Output: 34
     * Explanation: The largest element of the array is 35 and the second largest element is 34. [page:1]
     * <p>
     * 2)
     * Input:  arr[] = [10, 5, 10]
     * Output: 5
     * Explanation: The largest element of the array is 10 and the second largest element is 5. [page:1]
     * <p>
     * 3)
     * Input:  arr[] = [10, 10, 10]
     * Output: -1
     * Explanation: The largest element of the array is 10 and the second largest element does not exist. [page:1]
     * <p>
     * Constraints:
     * - 2 ≤ arr.size() ≤ 10^5
     * - 1 ≤ arr[i] ≤ 10^5 [page:1]
     */

    public int getSecondLargest(int[] arr) {
        // code here
        int maxElement = -1;
        int secondElement = -1;

        for (int num : arr) {
            if (maxElement < num) {
                secondElement = maxElement;
                maxElement = num;
            } else if (secondElement < num && maxElement != num) {
                secondElement = num;
            }
        }

        return secondElement;
    }

// 1752. Check if Array Is Sorted and Rotated
// Problem Statement:
// Given an array nums, return true if the array was originally sorted in
// non-decreasing order, then rotated some number of positions (including zero).
// Otherwise, return false. There may be duplicates in the original array.
// Note: An array A rotated by x positions results in an array B of the same
// length such that B[i] == A[(i + x) % A.length] for every valid index i.
//
// Example 1:
// Input: nums = [3,4,5,1,2]
// Output: true
// Explanation: [1,2,3,4,5] is the original sorted array.
// You can rotate the array by x = 2 positions to begin on the element of
// value 3: [3,4,5,1,2].
//
// Example 2:
// Input: nums = [2,1,3,4]
// Output: false
// Explanation: There is no sorted array once rotated that can make nums.
//
// Example 3:
// Input: nums = [1,2,3]
// Output: true
// Explanation: [1,2,3] is the original sorted array.
// You can rotate the array by x = 0 positions (i.e. no rotation) to make nums.
//
// Constraints:
// 1 <= nums.length <= 100
// 1 <= nums[i] <= 100


    public static boolean check(int[] nums) {
        if (nums.length == 1) {
            return true;
        }

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count > 1) { ///  early return
                return false;
            }
            if (nums[i] > nums[(i + 1) % nums.length]) {
                count++;
            }
        }

        return count == 0 || count == 1;
    }

    public static void main(String[] args) {
        System.out.println(Solutions.check(new int[]{2, 1, 3, 4}));
    }
}
