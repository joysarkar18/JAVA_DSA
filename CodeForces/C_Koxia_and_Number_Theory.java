import java.util.*;
import java.io.*;

//Joy Sarkar
public class C_Koxia_and_Number_Theory {
    public static void main(String[] args) {
        try {
            I_was_Made_For_Loving_You_Baby sc = new I_was_Made_For_Loving_You_Baby();
            You_was_Made_For_Loving_Me out = new You_was_Made_For_Loving_Me();
            int dont_copy_my_code = sc.nextInt();
            while (dont_copy_my_code-- > 0) {
                // write code here
                int n = sc.nextInt();
                long arr[] = new long[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextLong();
                }

                HashSet<Long> hs = new HashSet<>();
                for (int i = 0; i < n; i++) {
                    hs.add(arr[i]);
                }
                if (hs.size() != n) {
                    System.out.println("NO");
                    break;
                }

                for (int i = 0; i < n; i++) {
                    arr[i] += 999983;
                }

                int flag = 0;

                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (gcd(arr[i], arr[j]) != 1) {

                            flag = 1;
                            break;
                        }
                    }

                    if (flag == 1) {
                        break;
                    }
                }
                if (flag == 1) {
                    System.out.println("NO");

                } else {
                    System.out.println("YES");
                }

                HashMap<Integer, Integer> hm = new HashMap<>();
                String s = "agc";

            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }

    // space for helper functions

    // gcd function
    static public long gcd(Long a, Long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    // This class is for taking input faster
    static class I_was_Made_For_Loving_You_Baby {
        BufferedReader br;
        StringTokenizer st;

        public I_was_Made_For_Loving_You_Baby() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    // This class is for output faster
    static class You_was_Made_For_Loving_Me {
        private final BufferedWriter bw;

        public You_was_Made_For_Loving_Me() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.append("" + object);
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }
}