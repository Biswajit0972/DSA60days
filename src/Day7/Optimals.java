package Day7;

public class Optimals {
    public  int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }

        return res;
    }

    public int longestSubarray(int[] arr, int k) {
        int [] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }
        int maxL=0;
        for (int i = 0; i < prefix.length; i++) {
            if (prefix[i] == k) {
                maxL= Math.max(maxL, i +1);
            }
        }

        return maxL;
    }
    public static void main(String[] args) {
        Optimals op = new Optimals();

        System.out.println(op.longestSubarray(new int[] {10, -10, 20, 30}, 5));
    }
}
