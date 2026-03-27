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

    /**
26. Remove Duplicates from Sorted Array

Problem:
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place
such that each unique element appears only once. The relative order of the elements
should be kept the same.

Consider the number of unique elements in nums to be k.
After removing duplicates, return the number of unique elements k.

The first k elements of nums should contain the unique numbers in sorted order.
The remaining elements beyond index k - 1 can be ignored.

Custom Judge:
The judge will test your solution with the following code:

int[] nums = [...];                // Input array
int[] expectedNums = [...];        // The expected answer with correct length

int k = removeDuplicates(nums);    // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}

If all assertions pass, then your solution will be accepted.

Example 1:
Input:  nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation:
Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

Example 2:
Input:  nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation:
Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

Constraints:
1 <= nums.length <= 3 * 10^4
-100 <= nums[i] <= 100
nums is sorted in non-decreasing order.
*/

    public static int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] != nums[i]) {
                nums[k++] = nums[i];
            }
        }

        return k;
    }

    public static void main(String[] args) {
        System.out.println(Solutions.removeDuplicates(new int[]{5}));
    }
}
