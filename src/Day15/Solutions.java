package Day15;

public class Solutions {
    public int inversionCount(int arr[]) {
        // Code Here
        int countInversion = 0;
        int n = arr.length;

        for (int i = 0; i < n;i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    countInversion++;
                }
            }
        }

        return countInversion;
    }
    public static void main(String[] args) {
        Solutions s = new Solutions();
        System.out.println(s.inversionCount(new int[] {10, 10, 10}));
    }
}
