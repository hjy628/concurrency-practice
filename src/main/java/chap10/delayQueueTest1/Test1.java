package chap10.delayQueueTest1;

import java.util.Date;
import java.util.concurrent.DelayQueue;

/**
 * Created by hjy on 17-11-23.
 */
public class Test1 {

    public static void main(String[] args) throws InterruptedException{
        DelayQueue<UserInfo> queue = new DelayQueue<UserInfo>();
        queue.add(new UserInfo(7,"username5"));
        queue.add(new UserInfo(6,"username4"));
        queue.add(new UserInfo(5,"username3"));
        queue.add(new UserInfo(4,"username2"));
        queue.add(new UserInfo(3,"username1"));
        System.out.println(new Date());
        System.out.println(queue.take().getUsername()+" "+new Date());
        System.out.println(queue.take().getUsername()+" "+new Date());
        System.out.println(queue.take().getUsername()+" "+new Date());
        System.out.println(queue.take().getUsername()+" "+new Date());
        System.out.println(queue.take().getUsername()+" "+new Date());
    }

}
