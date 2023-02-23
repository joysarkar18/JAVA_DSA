import java.util.*;

/**
 * A_Watermelon
 */
public class A_Watermelon {

    static Scanner sc = new Scanner(System.in);

    public static void solve() {

        int n;
        n = sc.nextInt();
        if ((n & 1) == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        solve();
        sc.close();
    }
}