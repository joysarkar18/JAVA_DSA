import java.util.*;

/**
 * A_A_B
 */
public class A_A_B {

    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        String str = sc.next();
        int a = str.charAt(0) - '0';
        int b = str.charAt(2) - '0';
        int ans = a + b;
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