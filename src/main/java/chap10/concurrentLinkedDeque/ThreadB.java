package chap10.concurrentLinkedDeque;

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
        while (!service1.queue.isEmpty()){
            service1.queue.pollLast();
            System.out.println(service1.queue.size());
        }
    }
}
