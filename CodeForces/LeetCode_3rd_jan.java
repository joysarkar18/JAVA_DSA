import java.util.*;

public class LeetCode_3rd_jan {
    public static void main(String[] args) {
        String[] arr = { "a", "c", "b" };
        int k = minDeletionSize(arr);
    }

    public static int minDeletionSize(String[] strs) {
        String[] temp = strs;
        System.out.println(Arrays.toString(temp));

        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));
        return 0;

    }
}
