package chap10.linkedTransferQueue_5;


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
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.println("A处 队列大小为: "+service.queue.size());
        TimeUnit.MILLISECONDS.sleep(8000);
        System.out.println("A处 队列大小为: "+service.queue.size());
    }

}
