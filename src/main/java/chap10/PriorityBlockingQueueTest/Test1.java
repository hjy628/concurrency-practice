package chap10.PriorityBlockingQueueTest;

import java.util.concurrent.PriorityBlockingQueue;

/**
 * Created by hjy on 17-11-23.
 */
public class Test1 {

    public static void main(String[] args) {
        PriorityBlockingQueue<UserInfo> queue = new PriorityBlockingQueue<UserInfo>();
        queue.add(new UserInfo(12));
        queue.add(new UserInfo(13478));
        queue.add(new UserInfo(1569));
        queue.add(new UserInfo(1346));
        queue.add(new UserInfo(1762));
        queue.add(new UserInfo(1876876));


        System.out.println(queue.poll().getId());
        System.out.println(queue.poll().getId());
        System.out.println(queue.poll().getId());
        System.out.println(queue.poll().getId());
        System.out.println(queue.poll().getId());
        System.out.println(queue.poll().getId());
        System.out.println(queue.poll());
    }

}
