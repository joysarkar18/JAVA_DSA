import java.util.*;

/**
 * Nqueen
 */
public class Nqueen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println(nQueen(arr, 0));

        sc.close();

    }

    static int nQueen(int[][] arr, int row) {

        if (row == arr.length) {
            Display(arr);
            System.out.println();
            return 1;
        }
        int count = 0;

        for (int col = 0; col < arr.length; col++) {
            if (isSafe(arr, row, col)) {
                arr[row][col] = 1;
                count += nQueen(arr, row + 1);
                // if (count == 1) {
                // return count;
                // }
                arr[row][col] = 0;
            }

        }
        return count;
    }

    static boolean isSafe(int[][] arr, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (arr[i][col] == 1) {
                return false;
            }

        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (arr[i][j] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j < arr.length; i--, j++) {
            if (arr[i][j] == 1) {
                return false;
            }
        }

        return true;
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