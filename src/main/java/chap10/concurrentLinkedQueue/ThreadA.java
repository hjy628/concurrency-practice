package chap10.concurrentLinkedQueue;

import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-23.
 */
public class ThreadA extends Thread{

    private MyService1 service1;

    public ThreadA(MyService1 service1) {
        super();
        this.service1 = service1;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            service1.queue.add("ThreadA"+(i+1));
        }
    }
}
