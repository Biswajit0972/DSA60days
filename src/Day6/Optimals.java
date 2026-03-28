package Day6;

import java.util.ArrayList;

public class Optimals {
    public  ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> res = new ArrayList<>();
        int s1 = 0, s2 = 0;
        int n = a.length, m = b.length;

        while (s1 < n && s2 < m) {
            if (a[s1] < b[s2]) {
                if (res.isEmpty() || res.getLast() != a[s1]) {
                    res.add(a[s1]);
                }
                s1++;
            } else {
                if (res.isEmpty() || res.getLast() != b[s2]) {
                    res.add(b[s2]);
                }
                s2++;
            }
        }

        while (s1 < n) {
            if (res.getLast() != a[s1]) {
                res.add(a[s1]);
            }
            s1++;
        }

        while (s2 < m) {
            if (res.getLast() != b[s2]) {
                res.add(b[s2]);
            }
            s2++;
        }

        return res;
    }

    public static void main(String[] args) {
        Optimals o = new Optimals();
        for (Integer num : o.findUnion(new int[] {1, 1, 1, 1, 1}, new int[] {2, 2, 2, 2, 2})) {
            System.out.print(num + " ");
        }
    }
}
