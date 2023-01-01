
/**
 * A_Next_Round
 */
import java.util.*;

public class A_Next_Round {

    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= arr[k - 1] && arr[i] > 0) {
                ans++;

            }
        }

        System.out.println(ans);
        return;

    }

    public static void main(String[] args) {
        solve();
        sc.close();
    }
}