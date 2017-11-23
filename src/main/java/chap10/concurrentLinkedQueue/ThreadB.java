package chap10.concurrentLinkedQueue;

/**
 * Created by hjy on 17-11-23.
 */
public class ThreadB extends Thread{

    private MyService1 service1;

    public ThreadB(MyService1 service1) {
        super();
        this.service1 = service1;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            service1.queue.add("ThreadB"+(i+1));
        }
    }
}
