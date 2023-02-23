import java.util.Arrays;

public class KMP {
    public static void main(String[] args) {
        String str = "abfabchgfhas";
        String t = "abc";
        int arr[] = lps(t);
        int ans = kmp(str, t, arr);
        System.out.println(ans);

    }

    public static int kmp(String str, String t, int arr[]) {
        int n = str.length();
        int j = 0;
        int i = 0;
        int pos = -1;
        while (i < n) {
            if (str.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                if (j != 0) {
                    j = arr[j - 1];
                } else {
                    i++;
                }
            }

            if (j == t.length()) {
                pos = i - t.length();
                break;
            }
        }

        return pos;
    }

    public static int[] lps(String t) {
        int n = t.length();

        int ans[] = new int[n];

        for (int i = 1; i < n; i++) {
            int j = ans[i - 1];

            while (j > 0 && ans[i] != ans[j]) {
                j = ans[j - 1];
            }

            if (t.charAt(i) == t.charAt(j)) {
                j++;
                ans[i] = j;

            }
        }

        return ans;
    }
}
