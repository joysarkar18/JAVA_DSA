import java.util.*;

public class Min_Dist {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int n = sc.nextInt();
        String str = sc.next();
        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '1') {
                pos = i;
                break;
            }
        }

        for (int i = pos + 1; i < n; i++) {
            if (str.charAt(i) == '1') {
                int d = i - pos;
                if (d % 2 == 1) {
                    System.out.println(1);
                    return;
                }
            }

        }

        System.out.println(2);
    }

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            solve();

        }
        sc.close();
    }
}
