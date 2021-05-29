import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author mirau on 2021/5/28.
 * @version 1.0
 */
public class DemoA {

    private static final BlockingQueue<Object> queue = new ArrayBlockingQueue<>(1000_000);

    static {
        for (int i = 0; i < 10000; i++) {
            queue.add(new Object());
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println(22);
        }
    }
}
