package Day14;

import golbals.Utils;
import golbals.Utils.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Solutions {
    int maxLength(int arr[]) {
        int maxLength = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int sum = arr[i];
            for (int j = i + 1; j < n; j++) {
                sum += arr[j];
                if (sum == 0) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }

        return maxLength;
    }

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]); // nlogn
        ArrayList<int[]> checkPoint = new ArrayList<>();
        checkPoint.add(intervals[0]);

        for (int[] interval : intervals) {
            if (checkPoint.getLast()[1] >= interval[0] ) {
                checkPoint.getLast()[1] = Math.max(checkPoint.getLast()[1], interval[1]);
            } else {
                checkPoint.add(interval);
            }
        }
        int [][] res = new int[checkPoint.size()][2];
        for (int i = 0; i < res.length; i++) {
            res[i] = checkPoint.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        Solutions s = new Solutions();
        int[][] intervals = {
                {1, 4},
                {2, 3},

        };
      int [] [] res  =  s.merge(intervals);
      Utils.print2dArray(res);
    }
}
