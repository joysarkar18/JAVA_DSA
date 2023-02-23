import java.util.*;
import java.io.*;

//Joy Sarkar
public class C_Elemental_Decompress {
    static I_was_Made_For_Loving_You_Baby sc = new I_was_Made_For_Loving_You_Baby();
    static You_was_Made_For_Loving_Me out = new You_was_Made_For_Loving_Me();

    public static void main(String[] args) {
        try {

            int dont_copy_my_code = sc.nextInt();
            while (dont_copy_my_code-- > 0) {
                // write code here
                int n = sc.nextInt();
                int[] arr = readarr(n);

                HashSet<Integer> h1 = new HashSet<>();
                HashSet<Integer> h2 = new HashSet<>();

                for (int i = 1; i <= n; i++) {
                    h1.add(i);
                    h2.add(i);
                }
                int[] ans1 = new int[n];
                int[] ans2 = new int[n];
                int flag = 0;

                for (int i = 0; i < n; i++) {
                    if (h1.contains(arr[i]) || h2.contains(arr[i])) {
                        if (h1.contains(arr[i])) {
                            ans1[i] = arr[i];
                            h1.remove(arr[i]);
                        } else {
                            ans2[i] = arr[i];
                            h2.remove(arr[i]);
                        }

                    } else {
                        flag = 1;
                        break;

                    }
                }
                if (flag == 1) {
                    System.out.println("NO");
                }

                for (int i : h1) {
                    for (int j = 0; j < n; j++) {
                        if (ans1[i] == 0 && i <= ans2[i]) {
                            ans1[i] = i;
                            break;
                        }
                    }

                }

                for (int i : h2) {
                    for (int j = 0; j < n; j++) {
                        if (ans2[i] == 0 && i <= ans1[i]) {
                            ans2[i] = i;
                            break;
                        }
                    }

                }
                int f = 0;

                for (int i = 0; i < n; i++) {
                    if (ans1[i] == 0 || ans2[i] == 0) {
                        f = 1;
                        break;

                    }
                }
                if (f == 1) {
                    System.out.println("NO");
                }
                System.out.println("YES");
                display(ans1);
                display(ans2);

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
