package Day16;

public class Solutions {
    public int search(int[] nums, int target) {
        int st = 0;
        int ed = nums.length;

        while (st < ed) {
            int mid = st + (ed - st) /2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                st = mid+1;
            }else {
                ed = mid - 1;
            }
        }

        return -1;
    }

    int lowerBound(int[] arr, int target) {
        int st = 0;
        int ed = arr.length-1;
        int ans = -1;

        while (st <=ed) {
            int mid = st + (ed - st) /2;
            if (arr[mid] >= target) {
                ans = mid;
                ed = mid -1;
            }else {
                st = mid +1;
            }
        }

        return ans == -1? arr.length : ans;
    }

    public static void main(String[] args) {

    }
}
