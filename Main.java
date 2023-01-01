import java.util.*;

class Main {

    public static void main(String[] args) {
        String str = "aabc";
        System.out.println(FirstNonRepeating(str));
    }

    public static String FirstNonRepeating(String A) {
        // code here
        HashMap<Character, Integer> hm = new HashMap<>();
        String ans = "";

        List<Character> ll = new ArrayList<>();

        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            if (!hm.containsKey(ch)) {
                hm.put(ch, 1);
                ll.add(ch);

            } else {
                hm.put(ch, hm.get(ch) + 1);
            }

            int n = ll.size();
            int flag = 0;

            for (int j = 0; j < n; j++) {
                if (hm.get(ll.get(j)) == 1) {
                    flag = 1;
                    ans += ch;
                    break;

                }
            }

            if (flag == 0) {
                ans += "#";
            }

        }

        return ans;
    }
}