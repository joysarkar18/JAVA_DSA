import java.util.*;

/**
 * A_Domino_piling
 */
public class A_Domino_piling {

    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println((m * n) / 2);
    }

    public static void main(String[] args) {
        solve();
        sc.close();
    }
}