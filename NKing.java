
/**
 * NKing
 */
import java.util.*;

public class NKing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println(nKnight(arr, 0, 0, 8));

        sc.close();
    }

    static int nKnight(int[][] arr, int row, int col, int n) {
        if (n == 0) {
            System.out.println();
            Display(arr);
            return 1;
        }
        if (row == arr.length) {
            return 0;
        }

        int count = 0;

        if (col == arr.length) {
            count += nKnight(arr, row + 1, 0, n);
            return count;
        }
        if (isSafe(arr, row, col)) {
            arr[row][col] = 1;
            count += nKnight(arr, row, col + 1, n - 1);
            arr[row][col] = 0;

        }

        count += nKnight(arr, row, col + 1, n);

        return count;
    }

    static boolean isSafe(int[][] arr, int row, int col) {
        if (isValid(arr, row - 1, col - 2)) {
            if (arr[row - 1][col - 2] == 1) {
                return false;
            }
        }

        if (isValid(arr, row - 1, col + 2)) {
            if (arr[row - 1][col + 2] == 1) {
                return false;
            }
        }

        if (isValid(arr, row - 2, col + 1)) {
            if (arr[row - 2][col + 1] == 1) {
                return false;
            }
        }

        if (isValid(arr, row - 2, col - 1)) {
            if (arr[row - 2][col - 1] == 1) {
                return false;
            }
        }

        return true;
    }

    static boolean isValid(int[][] arr, int row, int col) {
        if ((row >= 0 && row < arr.length) && (col >= 0 && col < arr.length)) {
            return true;
        }

        return false;
    }

    static void Display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

}