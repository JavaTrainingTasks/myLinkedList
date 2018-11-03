import java.util.Iterator;
import java.util.Objects;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        myList<String> list = new myLinkedList<>();
        list.addLast("kek");
        list.addLast("lol");
        list.addLast("lol");
        list.addLast("lol");

        for (int i = 0; i< list.size(); i++)
            System.out.println(list.get(i));




    }
}
