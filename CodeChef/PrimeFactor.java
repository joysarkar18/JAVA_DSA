import java.util.ArrayList;
import java.util.Arrays;

public class PrimeFactor {
    public static void main(String[] args) {
        int arrr[] = new int[23];
        Arrays.fill(arrr, 5);
        System.out.println(Arrays.toString(arrr));

        int n = 12;
        ArrayList<Integer> arr = primeFactor(49);
        System.out.println(arr);

    }

    static ArrayList<Integer> primeFactor(int n) {

        ArrayList<Integer> ans = new ArrayList<>();
        if (n == 1) {
            System.out.println("No prime factor of 1\n");
            return ans;
        }

        if (n % 2 == 0) {
            while (n % 2 == 0) {
                ans.add(2);
                n = n / 2;
            }
        }

        if (n % 3 == 0) {
            while (n % 3 == 0) {
                ans.add(3);
                n = n / 3;
            }
        }

        for (int i = 5; i * i <= n; i += 6) {
            while (n % i == 0) {
                ans.add(i);
                n = n / i;
            }

            while (n % (i + 2) == 0) {
                ans.add((i + 2));
                n /= (i + 2);
            }
        }

        return ans;

    }

}
