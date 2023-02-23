import java.util.*;
import java.io.*;

//Joy Sarkar
public class B_Quick_Sort {
    static I_was_Made_For_Loving_You_Baby sc = new I_was_Made_For_Loving_You_Baby();
    static You_was_Made_For_Loving_Me out = new You_was_Made_For_Loving_Me();

    public static void main(String[] args) {
        try {

            int dont_copy_my_code = sc.nextInt();
            while (dont_copy_my_code-- > 0) {
                // write code here
                int n = sc.nextInt();
                int k = sc.nextInt();
                int[] arr = readarr(n);
                if (isSorted(arr)) {
                    System.out.println(0);
                } else {
                    int ans = 0;
                    int x = 1;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] == x) {
                            x++;
                        } else {
                            ans++;
                        }
                    }
                    System.out.println((ans + k - 1) / k);
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

    static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])
                return false;
        }
        return true;
    }

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
