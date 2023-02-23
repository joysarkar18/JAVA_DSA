import java.util.*;

/**
 * costgos
 */
public class costgos {

    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int n = sc.nextInt();
        int x = sc.nextInt();
        int fresh[] = new int[n];
        int cost[] = new int[n];

        for (int i = 0; i < n; i++) {
            fresh[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (fresh[i] >= x) {
                ans += cost[i];
            }
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            solve();

        }
        sc.close();
    }
}