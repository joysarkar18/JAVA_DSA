import java.util.*;

public class mapTut {
    public static void main(String[] args) {
        int a = 20, b = 5, c = 4;
        a = b + c;
        c = a - b;
        c = b + c;
        c = c + a;
        b = b - a;
        a = c + b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

}
