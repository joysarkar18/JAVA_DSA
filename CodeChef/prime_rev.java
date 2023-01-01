import java.util.*;

public class prime_rev {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int n = sc.nextInt();
        String str = sc.next();
        String s = sc.next();
        int st1 = 0;
        int st2 = 0;

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '1') {
                st1++;

            }
            if (s.charAt(i) == '1') {
                st2++;
            }
        }

        if (st1 == st2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            solve();

        }
        sc.close();
    }
}
