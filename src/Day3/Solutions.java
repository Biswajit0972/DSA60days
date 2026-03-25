package Day3;

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

    public static void main(String[] args) {

    }
}
