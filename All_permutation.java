import java.util.ArrayList;

/**
 * All_permutation
 */
public class All_permutation {

    public static void main(String[] args) {
        ArrayList<String> ans = permutation("", "ABC");
        String s = "abc";
        ans.re
        ans.sort(null);
        System.out.println(ans.toString());
    }

    static ArrayList<String> permutation(String p, String u) {
        if (u.isEmpty()) {
            ArrayList<String> a = new ArrayList<>();
            a.add(p);
            return a;
        }

        ArrayList<String> ans = new ArrayList<>();

        char ch = u.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String s = p.substring(0, i);
            String l = p.substring(i, p.length());
            ans.addAll(permutation(s + ch + l, u.substring(1)));
        }

        return ans;
    }
}