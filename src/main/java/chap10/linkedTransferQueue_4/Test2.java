package chap10.linkedTransferQueue_4;


import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-23.
 */
public class Test2 {

    public static void main(String[] args) throws InterruptedException{
        MyServiceB service = new MyServiceB();

        ThreadB1 a = new ThreadB1(service);
        a.setName("a");

        a.start();
        TimeUnit.SECONDS.sleep(4);
        System.out.println("队列大小为: "+service.queue.size());
    }

}
