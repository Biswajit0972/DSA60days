package Break1.Day1;

import java.util.Arrays;

public class Solutions {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};

        //! base case
        if (nums.length == 0) return result;

        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i] && result[0] == -1) {
                result[0] = i;
            }

            // second  condition
            if (result[0] != -1 && (target != nums[i] && result[1] == -1)) {
                result[1] = i - 1;
            }

        }

        if (result[1] == -1) {
            result[1] = result[0];
        }

        return result;
    }

    private int lowerBound(int[] nums, int target) {
        int lo = 0, hi = nums.length;                  // search in [lo, hi)
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] >= target) hi = mid;
            else lo = mid + 1;
        }
        return lo;
    }

    private int upperBound(int[] nums, int target) {
        int lo = 0, hi = nums.length;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] > target) hi = mid;
            else lo = mid + 1;
        }
        return lo;
    }

    int countFreq(int[] arr, int target) {
        if (arr.length == 0) return 0;

        int firstIndex = lowerBound(arr,  target);

        if (firstIndex == arr.length || arr[firstIndex] !=target) return 0;

        int secondIndex = upperBound(arr, target) - 1;

        return secondIndex - firstIndex + 1;
    }

    public int search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length-1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if  (nums[mid] == target) {
                return mid;
            }else if (target <= nums[mid]) {
                if(target >= nums[lo] && target < nums[mid]) {
                    hi = mid-1;
                }else {
                    lo = mid + 1;
                }
            }else {
                if (target > nums[mid] && target <= nums[hi]) {
                    lo = mid + 1;
                }else {
                    hi = mid  - 1;
                }
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        Solutions s = new Solutions();
        int [] nums = {1, 1, 2, 2, 2, 2, 3};
        System.out.println(s.countFreq(nums,  4));
    }
}
