import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Chaining_java
 */
public class Chaining_java {

    public static void main(String[] args) {
        int arr[] = { 70, 71, 72, 73, 74, 75, 76, 77, 21 };
        Chaining ch = new Chaining(arr.length);
        for (int a : arr) {
            ch.add(a);
        }
        ch.display();

    }

    /**
     * InnerChaining_java
     */
    public static class Chaining {
        int n;
        ArrayList<LinkedList<Integer>> arr;

        public Chaining(int n) {
            this.n = n;
            arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                arr.add(new LinkedList<Integer>());

            }
        }

        public void add(int key) {
            int i = key % n;
            arr.get(i).add(key);
        }

        public void remove(int key) {
            int i = key % n;
            arr.get(i).remove(i);
        }

        public void display() {
            for (int i = 0; i < n; i++) {
                if (arr.get(i) != null) {
                    System.out.println(arr.get(i));
                }
            }
        }

    }

}