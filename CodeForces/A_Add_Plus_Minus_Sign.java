import java.util.*;

/**
 * A_Add_Plus_Minus_Sign
 */
public class A_Add_Plus_Minus_Sign {

    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int n = sc.nextInt();
        String s = sc.next();
        int cnt = 0;

        if (s.charAt(0) == '1') {
            cnt = 1;

        } else {
            cnt = 0;
        }
        String ans = "";
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == '1' && cnt == 0) {
                ans += "+";
                cnt++;
            } else if (s.charAt(i) == '0') {
                ans += "+";

            }

            else {
                ans += "-";
                cnt--;

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