package Day9;

public class Optimize {
    public int majorityElement(int[] nums) {
        int element = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == element) {
                count++;
            }else {
                count--;
                if (count == 0) {
                    element = nums[i];
                    count = 1;
                }
            }
        }

        return element;
    }

    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int num : nums) {
            sum += num;
            maxSum=  Math.max(maxSum,  sum);
            if (sum < 0) {
                sum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Optimize op =  new Optimize();
        System.out.println(op.majorityElement(new int[] {4,1,2,1,2}));
    }
}
