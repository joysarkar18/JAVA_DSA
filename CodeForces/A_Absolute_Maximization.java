import java.util.*;

/**
 * A_Absolute_Maximization
 */
public class A_Absolute_Maximization {

    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            max = max | arr[i];
            min = min & arr[i];
        }

        System.out.println((max - min));

    }

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            solve();

        }
        sc.close();
    }
}