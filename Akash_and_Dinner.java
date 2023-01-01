
/**
 * Akash_and_Dinner
 */
import java.util.*;

public class Akash_and_Dinner {

    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int cat[] = new int[n];
        int time[] = new int[n];
        for (int i = 0; i < n; i++) {
            cat[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            time[i] = sc.nextInt();
        }

        if (k == 1) {
            int ans = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                ans = Math.min(ans, time[i]);

            }
            System.out.println(ans);
            return;
        }

        int hash[] = new int[100001];
        for (int i = 0; i <= 100000; i++) {
            hash[i] = Integer.MAX_VALUE - 1;
        }

        for (int i = 0; i < n; i++) {
            hash[cat[i]] = Math.min(hash[cat[i]], time[i]);
        }

        Arrays.sort(hash);

        long ans = 0;
        for (int i = 0; i < k; i++) {
            if (hash[i] == Integer.MAX_VALUE - 1) {
                System.out.println(-1);
                return;
            }
            ans += hash[i];
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