public class Test {
    public static void main(String[] args) {
        System.out.println(isPal("aabbaaa"));

    }

    static boolean isPal(String str) {
        int n = str.length();
        boolean ch = false;
        if ((n & 1) == 1) {

            int k = n / 2;
            String s1 = str.substring(0, k);
            StringBuilder sb = new StringBuilder(str.substring(k + 1));
            sb.reverse();
            String s2 = sb.toString();
            if (s1.equals(s2)) {
                ch = true;
            }
        }

        else {

            int k = n / 2;
            String s1 = str.substring(0, k);
            StringBuilder sb = new StringBuilder(str.substring(k, n));
            sb.reverse();
            String s2 = sb.toString();
            if (s1.equals(s2)) {
                ch = true;
            }

        }

        return ch;
    }
}
