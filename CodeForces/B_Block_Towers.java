import java.util.*;

/**
 * B_Block_Towers
 */
public class B_Block_Towers {

    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = arr[0];
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (arr[i] > ans) {
                int a = arr[i] - ans;
                if (a % 2 == 0) {
                    ans += a / 2;
                }

                else {
                    ans += (a + 1) / 2;
                }
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