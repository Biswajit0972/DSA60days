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
Problem: Second Largest

Given an array of positive integers arr[], return the second largest element from the array.
If the second largest element doesn't exist then return -1. [page:1]

Note:
- The second largest element should not be equal to the largest element. [page:1]

Examples:
1)
Input:  arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34. [page:1]

2)
Input:  arr[] = [10, 5, 10]
Output: 5
Explanation: The largest element of the array is 10 and the second largest element is 5. [page:1]

3)
Input:  arr[] = [10, 10, 10]
Output: -1
Explanation: The largest element of the array is 10 and the second largest element does not exist. [page:1]

Constraints:
- 2 ≤ arr.size() ≤ 10^5
- 1 ≤ arr[i] ≤ 10^5 [page:1]
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

}
