package Day2;

public class Solutions {
    public int countDigits(int n) {
        return Long.toString(n).length();
    }

    public static void main(String[] args) {
        Solutions s = new Solutions();
        System.out.println(s.countDigits(23));
    }
}
