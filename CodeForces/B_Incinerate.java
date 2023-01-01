import java.util.*;

/**
 * B_Incinerate
 */
public class B_Incinerate {

    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int n = sc.nextInt();
        int k = sc.nextInt();

        int hp[] = new int[n];
        int pow[] = new int[n];

        for (int i = 0; i < n; i++) {
            hp[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            pow[i] = sc.nextInt();
        }

        while (k > 0) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                hp[i] = hp[i] - k;
                if (hp[i] <= 0) {
                    hp[i] = 0;
                }
                sum += hp[i];
            }
            if (sum == 0) {
                System.out.println("YES");
                return;
            }

            int min = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                if (hp[i] > 0) {
                    min = Math.min(min, pow[i]);
                }
            }
            k = k - min;

        }
        System.out.println("NO");
    }

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            solve();

        }
        sc.close();
    }
}