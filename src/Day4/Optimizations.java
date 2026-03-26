package Day4;

import java.util.ArrayList;
import java.util.List;

public class Optimizations {
    public List<Integer> frequencyCount(int[] arr) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            while (arr[i] > 0) {
                int currVal = arr[i]-1;
                if (arr[currVal] < 0) {
                    arr[currVal]--;
                    arr[i] = 0;
                }else {
                    swap(arr, currVal, i);
                }
            }
        }

        for (int num : arr) {
            res.add(-num);
        }

        return res;
    }

    public void swap(int [] arr, int idx, int i) {
            int temp  = arr[idx];
            arr[idx] = -1;
            arr[i] = temp;
     }
    public static void main(String[] args) {
        Optimizations o = new Optimizations();
        for (Integer num : o.frequencyCount(new int[] {1})) {
            System.out.print(num + " ");
        }
    }
}
