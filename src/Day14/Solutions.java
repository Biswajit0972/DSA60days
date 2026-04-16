package Day14;

public class Solutions {
    int maxLength(int arr[]) {
        int maxLength = 0;
        int n = arr.length;

        for (int i  = 0; i < n;i++) {
            int sum = arr[i];
            for (int j = i + 1; j< n; j++) {
                sum += arr[j];
                if (sum == 0) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }

        return maxLength;
    }
    public static void main(String[] args) {
        Solutions s = new Solutions();
        System.out.println(s.maxLength(new int[] {15,  -15,  0,0}));
    }
}
