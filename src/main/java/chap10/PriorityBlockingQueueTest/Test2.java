package chap10.PriorityBlockingQueueTest;

import java.util.concurrent.PriorityBlockingQueue;

/**
 * Created by hjy on 17-11-23.
 */
public class Test2 {

    public static void main(String[] args) throws InterruptedException{
        PriorityBlockingQueue<UserInfo> queue = new PriorityBlockingQueue<UserInfo>();
        System.out.println("begin");
        System.out.println(queue.take());
        System.out.println("end");
    }

}
