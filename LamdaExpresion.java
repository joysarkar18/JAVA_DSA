import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LamdaExpresion {
    public static void main(String[] args) {

        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(33);
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(5);
        ar.add(6);
        ar.add(7);
        ar.add(8);
        int arr[] = { 1, 2, 3, 4, 4 };
        Collections.reverse(Arrays.asList(arr));
        // Collections.rotate(ar, -1);
        System.out.println(Arrays.toString(arr));
        // int arr[][] = { { 4, 5 }, { 1, 4 }, { 1, 2 }, { 7, 9 }, { 10, 11 } };
        // Arrays.sort(arr, (a, b) -> {
        // if (a[0] == b[0]) {
        // return a[1] - b[1];
        // }

        // return a[0] - b[0];
        // });

        // for (int i = 0; i < 5; i++) {
        // System.out.println(arr[i][0] + " " + arr[i][1]);
        // }

    }
}
