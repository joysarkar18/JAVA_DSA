import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = { 4, 2, 7, 1, 5, 3, 7, 12, 89, 34, 57, 82, 45, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int lo, int hi) {
        if (lo < hi) {
            int p = pivit(arr, lo, hi);
            quickSort(arr, lo, p - 1);
            quickSort(arr, p + 1, hi);
        }
    }

    static int pivit(int[] arr, int lo, int hi) {
        int p = arr[hi];
        int j = lo - 1;
        for (int i = lo; i < hi; i++) {
            if (arr[i] < p) {
                j++;
                swap(arr, j, i);
            }
        }

        swap(arr, j + 1, hi);
        return j + 1;

    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
