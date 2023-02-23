import java.util.*;

/**
 * B_Make_Array_Good
 */
public class B_Make_Array_Good {

    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int n = sc.nextInt();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

    }

    public static void main(String[] args) {
        solve();
        sc.close();
    }
}