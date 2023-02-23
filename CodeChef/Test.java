import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Deque<Integer> dp = new ArrayDeque<>();
        dp.offer(1);
        dp.offer(2);
        System.out.println(dp.getLast());
        for (Integer e : dp) {
            System.out.println(e);
        }

    }

}
