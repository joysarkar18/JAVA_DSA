import java.util.*;

/**
 * B_Coloring
 */
public class B_Coloring {

    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[m];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);

        }

        if (k > m) {
            System.out.println("No");
            return;
        }
        int a = n / k;
        int b = max - a;
        if (b == 1) {
            int d = n - (((a - 1) * k) + 1);
            if (d < k) {
                System.out.println("NO");
                return;
            }

            System.out.println("YES");
            return;
        }

        if (b >= 2) {
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