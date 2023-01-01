import java.util.Arrays;

public class KMP {
    public static void main(String[] args) {

        String t = "abcabf";
        int arr[] = lps(t);
        System.out.println(Arrays.toString(arr));

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
