package Day6;

import java.util.Arrays;

public class Solutions {
    public void rotate(int[] nums, int k) {
        if (k == 0) return;
        reverse(nums, 0, nums.length-1);
        reverse(nums, k, nums.length-1);
        reverse(nums,0, k-1);
    }

    public void reverse(int [] nums, int st,  int ed) {
        if (st >= ed) {
            return;
        }

        int temp = nums[st];
        nums[st] = nums[ed];
        nums[ed] = temp;
        reverse(nums,  st+1, ed-1);
    }

    public void moveZeroes(int[] nums) {
        int zero = 0;
        int st = 0;
        while (st < nums.length) {
            if (nums[st] != 0 && nums[zero] == 0) {
                int temp = nums[st];
                nums[st] = 0;
                nums[zero] = temp;
                zero++;
                st++;
            }else {
                st++;
            }
        }
    }

    public static void main(String[] args) {
        Solutions s = new Solutions();
        int [] nums = {-1,-100,3,99};
        s.rotate(nums, 2);
        System.out.println(Arrays.toString(nums));
    }
}
