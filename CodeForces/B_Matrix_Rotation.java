import java.util.*;

/**
 * B_Matrix_Rotation
 */
public class B_Matrix_Rotation {

    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int arr[][] = new int[2][2];
        arr[0][0] = sc.nextInt();
        arr[0][1] = sc.nextInt();
        arr[1][0] = sc.nextInt();
        arr[1][1] = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            if (valid(arr)) {
                System.out.println("YES");
                return;
            } else {
                rotate(arr);
            }

        }

        System.out.println("NO");

    }

    static boolean valid(int[][] arr) {
        if (arr[0][0] > arr[0][1]) {
            return false;
        }
        if (arr[1][0] > arr[1][1]) {
            return false;
        }
        if (arr[0][0] > arr[1][0]) {
            return false;
        }
        if (arr[0][1] > arr[1][1]) {
            return false;
        }

        return true;
    }

    static void rotate(int[][] arr) {
        int t1 = arr[0][0];
        int t2 = arr[0][1];
        int t3 = arr[1][0];
        int t4 = arr[1][1];

        arr[0][0] = t3;
        arr[0][1] = t1;
        arr[1][0] = t4;
        arr[1][1] = t2;
    }

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            solve();

        }
        sc.close();
    }
}