package chap10.synchronousQueueTest1;

import java.util.concurrent.SynchronousQueue;

/**
 * Created by hjy on 17-11-23.
 */
public class Test1 {

    public static void main(String[] args) throws InterruptedException{
        SynchronousQueue queue = new SynchronousQueue();
        System.out.println("step1");
        queue.put("anyString");
        System.out.println("step2");
        System.out.println(queue.take());
        System.out.println("step3");
    }

}
