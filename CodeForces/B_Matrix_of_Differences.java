import java.util.*;
import java.io.*;

//Joy Sarkar
public class B_Matrix_of_Differences {
    static I_was_Made_For_Loving_You_Baby sc = new I_was_Made_For_Loving_You_Baby();
    static You_was_Made_For_Loving_Me out = new You_was_Made_For_Loving_Me();

    public static void main(String[] args) {
        try {

            int dont_copy_my_code = sc.nextInt();
            while (dont_copy_my_code-- > 0) {
                // write code here
                int n = sc.nextInt();
                int k = n * n;
                int arr[] = new int[k];

                int a = 1;
                int b = n * n;

                for (int i = 0; i < k; i++) {
                    if (i % 2 == 0) {
                        arr[i] = a;
                        a++;

                    } else {
                        arr[i] = b;
                        b--;
                    }
                }

                int r = n;
                int c = n;

                int ans[][] = new int[n][n];

                int row_start = 0;
                int col_start = 0;
                int row_end = r - 1;
                int col_end = c - 1;
                int cnt = n * n;
                int j = 0;

                while (j < cnt) {

                    for (int i = col_start; i <= col_end; i++) {
                        ans[row_start][i] = arr[j];
                        j++;
                    }
                    if (j == cnt) {
                        break;
                    }
                    row_start++;

                    for (int i = row_start; i <= row_end; i++) {
                        ans[i][col_end] = arr[j];
                        j++;
                    }
                    if (j == cnt) {
                        break;
                    }
                    col_end--;

                    for (int i = col_end; i >= col_start; i--) {
                        ans[row_end][i] = arr[j];
                        j++;
                    }
                    if (j == cnt) {
                        break;
                    }

                    row_end--;

                    for (int i = row_end; i >= row_start; i--) {
                        ans[i][col_start] = arr[j];
                        j++;

                    }
                    if (j == cnt) {
                        break;
                    }
                    col_start++;

                }

                for (int i = 0; i < n; i++) {
                    for (int l = 0; l < n; l++) {
                        System.out.print(ans[i][l] + " ");
                    }
                    System.out.println();
                }

            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
    // name : Joy Sarkar
    // Email : joysarkar8171@gmail.com

    // Sharmila Sarkar
    // Dream On
    // baba , ma

    public static int[] readarr(int n) {
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static long[] readarr2(int n) {
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        return arr;
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        return;
    }

    public static long lcm(long a, long b) {
        long ans = (a * b) / gcd(a, b);
        return ans;
    }

    // gcd function
    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
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

    public static class Pair {
        int first;
        int second;

        Pair(int a, int b) {
            this.first = a;
            this.second = b;
        }

        Pair() {
        }

        void setValue(int a, int b) {
            this.first = a;
            this.second = b;
        }

        Pair getValue() {
            return this;
        }

        @Override
        public String toString() {
            return "[first=" + first + ", second=" + second + "]";
        }

    }

}
