import java.util.Arrays;

public class MergSort {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 9, 3, 6, 7 };
        arr = mergsort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static int[] mergsort(int arr[]) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergsort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergsort(Arrays.copyOfRange(arr, mid, arr.length));

        return merg(left, right);
    }

    static int[] merg(int[] left, int[] right) {
        int[] ans = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                ans[k] = left[i];
                i++;
                k++;
            }

            else {
                ans[k] = right[j];
                j++;
                k++;
            }
        }

        while (i < left.length) {
            ans[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            ans[k] = right[j];
            j++;
            k++;
        }

        return ans;
    }

}
