import java.util.ArrayDeque;
import java.util.Queue;

public class Market {
    Queue<String> queue1 = new ArrayDeque<>(5);
    Queue<String> queue2 = new ArrayDeque<>(5);
    Queue<String> queue3 = new ArrayDeque<>(5);

    public void add(String s) {
        if (queue1.size() < 5) {
            queue1.add(s);
            System.out.println(s + " Добавлено в очередь 1");
        } else {
            if (queue2.size() < 5) {
                queue2.add(s);
                System.out.println(s + " Добавлено в очередь 2");
            } else {
                if (queue3.size() < 5) {
                    queue3.add(s);
                    System.out.println(s + " Добавлено в очередь 3");
                } else {
                    System.out.println("Позовите Галю!");
                }
            }
        }
    }
}
