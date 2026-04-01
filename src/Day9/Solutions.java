package Day9;

public class Solutions {
    public int majorityElement(int[] nums) {
        int EligibleFreq = nums.length / 2;

        for (int num : nums) {
            int count = 0;
            for (int i : nums) {
                if (num == i) {
                    count++;
                }

                if (count > EligibleFreq) {
                    return num;
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Solutions s = new Solutions();
        System.out.println(s.majorityElement(new  int [] {6,5,5}));
    }
}
