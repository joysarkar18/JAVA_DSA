import java.util.*;

public class Spice {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int n = sc.nextInt();
        if (n < 4) {
            System.out.println("MILD");
        } else if (n >= 4 && n < 7) {
            System.out.println("MEDIUM");
        } else {
            System.out.println("HOT");
        }
    }

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            solve();

        }
        sc.close();
    }
}
