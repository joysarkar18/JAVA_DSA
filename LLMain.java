import java.util.ArrayList;

public class LLMain {
    public static void main(String[] args) {
        LL list = new LL();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.addFirst(44);
        list.display();
        list.reverseList();
        list.display();
    }

}
