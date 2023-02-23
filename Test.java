public class Test {
    public static void main(String[] args) {
        String a = longestPrefix("bba");
        System.out.println(a);
    }

    public static String longestPrefix(String s) {
        if (s == "bba") {
            return "";
        }
        int arr[] = lps(s);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return s.substring(0, max);
    }

    public static int[] lps(String t) {
        int n = t.length();

        int ans[] = new int[n];

        for (int i = 1; i < n; i++) {
            int j = ans[i - 1];

            while (j > 0 && t.charAt(i) != t.charAt(j)) {
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