import java.util.*;

/**
 * A_Divide_and_Conquer
 */
public class A_Divide_and_Conquer {

    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int odd = 0;

        for (int i = 0; i < n; i++) {
            if ((arr[i] & 1) == 1) {
                odd++;
            }
        }

        if (odd % 2 == 0) {
            System.out.println(0);
            return;
        }

        else {
            int ans = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if ((arr[i] & 1) == 1) {
                    int c = cnt(arr[i]);
                    ans = Math.min(ans, c);
                } else {
                    int c = cnt2(arr[i]);
                    ans = Math.min(ans, c);
                }
            }
            System.out.println(ans);

        }

    }

    static int cnt(int n) {
        int ans = 0;
        while ((n & 1) == 1) {
            n = n / 2;
            ans++;

        }

        return ans;
    }

    static int cnt2(int n) {
        int ans = 0;
        while ((n & 1) == 0) {
            n = n / 2;
            ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            solve();

        }
        sc.close();
    }
}