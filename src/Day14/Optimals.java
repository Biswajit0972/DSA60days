package Day14;

import java.util.HashMap;

public class Optimals {

    int maxLength(int arr[]) {
        HashMap<Integer,  Integer> bucket = new HashMap<>();
        int prefixSum = 0;
        int maxL = 0;

        bucket.put(0, -1);

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (bucket.containsKey(prefixSum)) {
                int length = i - bucket.get(prefixSum);
                maxL = Math.max(maxL, length);
            }else {
                bucket.put(prefixSum, i);
            }
        }

        return maxL;
    }

    public static void main(String[] args) {
        Optimals op = new Optimals();
        System.out.println(op.maxLength(new int[] {15, -15,0,0}));
    }
}
