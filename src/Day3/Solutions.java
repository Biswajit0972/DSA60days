package Day3;

import java.util.ArrayList;

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
    public static void main(String[] args) {
        Solutions.print_divisors(20);
    }
}
