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
    public static void main(String[] args) {

    }
}
