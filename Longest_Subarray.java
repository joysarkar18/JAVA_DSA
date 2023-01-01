
/**
 * Longest_Subarray
 */
import java.util.*;

public class Longest_Subarray {

  static Scanner sc = new Scanner(System.in);

  public static void solve() {
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
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