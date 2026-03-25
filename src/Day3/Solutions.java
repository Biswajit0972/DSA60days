package Day3;

import java.util.ArrayList;
import java.util.Arrays;

public class Solutions {
    static boolean armstrongNumber(int n) {
        int res = 0;
        int temp = n;

        while (n != 0) {
            int lastDigit = n % 10;
            res += (int) Math.pow(lastDigit, 3);
            n /= 10;
        }

        return res  == temp;
    }

    public static void print_divisors(int n) {
        ArrayList<Integer> small = new ArrayList<>();
        ArrayList<Integer> large = new ArrayList<>();

        for (int i = 1 ;i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                small.add(i);

                if (i != n / i) {
                    large.add(n/i);
                }
            }
        }

        for (Integer num : small) {
            System.out.println(num);
        }

        for (int i = large.size() - 1; i >= 0; i--) {
            System.out.println(large.get(i));
        }
    }

    static boolean isPrime(int n) {
        // code here
        if (n  == 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    static void printGfg(int N) {
        // code here
        if (N == 0) return;
        System.out.print("GFG" + " ");
        printGfg(N-1);
    }

    static void print1toN (int n) {
        if (n == 0) return;
        print1toN(n -1);
        System.out.println(n);
    }

    static int sumOfn (int n) {
        if (n == 0) {
            return  0;
        }

        return n  + sumOfn(n-1);
    }

    static int findFact (int  n) {
        if (n == 1 || n == 0) {
            return  1;
        }

        return n  * findFact(n-1);
    }

    static void reverse (int [] arr,  int st,  int ed) {
        if(st >= ed) {
            return;
        }
        int temp = arr[st];
        arr[st] = arr[ed];
        arr[ed] = temp;
        reverse(arr, st+1,   ed -1);
    }

    public static boolean isPalindrome(String s, int st,  int ed) {
       if (st > ed) {
           return true;
       }

       if (s.charAt(st) != s.charAt(ed)) {
           return false;
       }

       return isPalindrome(s,  st+1, ed-1);
    }
    public static void main(String[] args) {
        System.out.println(Solutions.isPalindrome("raceacar", 0, "raceacar".length() - 1));
    }
}
