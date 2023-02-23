import java.util.*;

public class mapTut {
    public static void main(String[] args) {
        System.out.println("main");
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(1, 2);
        for (Map.Entry<Integer, Integer> i : hm.entrySet()) {
            System.out.println(i.getValue());
        }

    }

}
