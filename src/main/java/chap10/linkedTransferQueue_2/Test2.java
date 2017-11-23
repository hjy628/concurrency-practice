package chap10.linkedTransferQueue_2;


import java.sql.Time;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-23.
 */
public class Test2 {

    public static void main(String[] args) throws InterruptedException{
        MyServiceB service = new MyServiceB();

        ThreadB2 b = new ThreadB2(service);
        b.setName("b");
        b.start();
        TimeUnit.SECONDS.sleep(3);
        System.out.println("队列中欧的元素个数为: "+service.queue.size());
    }

}
