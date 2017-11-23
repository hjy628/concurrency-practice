package chap10.arrayVlockingQueueTest1;

import java.util.Date;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by hjy on 17-11-23.
 */
public class Take {

    public static void main(String[] args) throws InterruptedException{
        ArrayBlockingQueue queue = new ArrayBlockingQueue(3);
        System.out.println("begin:"+new Date());
        queue.take();
        System.out.println("end:"+new Date());
    }

}
