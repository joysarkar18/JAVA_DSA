
/**
 * Gcd_of_Subarrays
 */
import java.util.*;

public class Gcd_of_Subarrays {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int n = sc.nextInt();
        long k = sc.nextLong();
        long sum = (n * (n + 1)) / 2;
        if (sum > k) {
            System.out.println(-1);
            return;
        }
        long x = k - sum + 1;
        long[] ans = new long[n];
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                ans[i] = x;
            } else {
                ans[i] = 1;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
        return;
    }

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            solve();

        }
        sc.close();
    }
}