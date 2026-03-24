package Day2;

public class Solutions {
    public int countDigits(int n) {
        return Long.toString(n).length();
    }

    public int reverse(int x) {
        int res = 0;

// Reverse integer with overflow handling (32-bit)
// Key idea: Check overflow BEFORE multiplying by 10
// If res > MAX/10 OR (res == MAX/10 && digit > 7) → overflow
// If res < MIN/10 OR (res == MIN/10 && digit < -8) → overflow
// Return 0 in overflow case
// Works for both positive and negative (no need for Math.abs)
// TC: O(log10 n), SC: O(1)

        while (x != 0) {
            int lastDigit = x % 10;
            if (res > Integer.MAX_VALUE / 10 ||
                    (res == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
                return 0;
            }

            if (res < Integer.MIN_VALUE / 10 ||
                    (res == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
                return 0;
            }

            res = (res * 10) + lastDigit;
            x /= 10;
        }


        return res;
    }

    public static void main(String[] args) {
        Solutions s = new Solutions();
        System.out.println(s.reverse(1534236469));
    }
}
