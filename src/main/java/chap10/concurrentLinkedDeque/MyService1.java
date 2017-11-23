package chap10.concurrentLinkedDeque;

import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * Created by hjy on 17-11-23.
 */
public class MyService1 {

    public ConcurrentLinkedDeque queue = new ConcurrentLinkedDeque();

    public MyService1() {
        for (int i = 0; i < 10000; i++) {
            queue.add("string"+(i+1));
        }
    }
}
