
/**
 * Gcd_of_Subarrays
 */
import java.util.*;

class Maximise_XOR {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        String str1 = sc.next();
        String str2 = sc.next();

        int one1 = 0;
        int zero1 = 0;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == '1') {
                one1++;
            }
            if (str1.charAt(i) == '0') {
                zero1++;
            }
        }

        int one2 = 0;
        int zero2 = 0;

        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == '1') {
                one2++;
            }
            if (str2.charAt(i) == '0') {
                zero2++;
            }
        }

        int cnt = Math.min(one1, zero2) + Math.min(zero1, one2);
        String ans = "";
        for (int i = 0; i < str1.length(); i++) {
            if (cnt > 0) {
                ans += "1";
                cnt--;
            }

            else {
                ans += "0";
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