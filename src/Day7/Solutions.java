package Day7;

public class Solutions {
    public  int singleNumber(int[] nums) {
        int [] count = new int[60001];
        for (int num:nums) {
            count[num + 30000]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] == 1) {
                return -30000+i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Solutions s = new Solutions();
        int [] nums  = {-28485, -29999, -15000, -28485};
        System.out.println(s.singleNumber(nums));
    }
}
