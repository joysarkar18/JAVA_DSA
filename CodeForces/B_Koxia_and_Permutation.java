import java.util.*;
import java.io.*;

//Joy Sarkar
public class B_Koxia_and_Permutation {
    public static void main(String[] args) {
        try {
            I_was_Made_For_Loving_You_Baby sc = new I_was_Made_For_Loving_You_Baby();
            You_was_Made_For_Loving_Me out = new You_was_Made_For_Loving_Me();
            int dont_copy_my_code = sc.nextInt();
            while (dont_copy_my_code-- > 0) {
                // write code here
                int n = sc.nextInt();
                int k = sc.nextInt();
                int arr[] = new int[n];
                int v = n;
                int m = 1;
                for (int i = 0; i < n; i++) {
                    if (m == v) {
                        arr[n - 1] = m;
                        break;

                    }
                    arr[i] = v;
                    v--;
                    arr[i + 1] = m;
                    i++;
                    m++;

                }

                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();

            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }

    // space for helper functions

    // gcd function
    public int gcd(int a, int b) {
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