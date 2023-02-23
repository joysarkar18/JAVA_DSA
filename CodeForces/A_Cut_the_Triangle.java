import java.util.*;

/**
 * A_Cut_the_Triangle
 */
public class A_Cut_the_Triangle {

    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        long x1 = sc.nextLong();
        long x2 = sc.nextLong();
        long y1 = sc.nextLong();
        long y2 = sc.nextLong();
        long z1 = sc.nextLong();
        long z2 = sc.nextLong();

        long a = x1 ^ y1 ^ z1;
        long b = x2 ^ y2 ^ z2;
        if ((a == x1 || a == y1 || a == z1) && (b == x2 || b == y2 || b == z2)) {
            System.out.println("NO");
            return;
        }
        System.out.println("YES");

    }

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            solve();

        }
        sc.close();
    }
}