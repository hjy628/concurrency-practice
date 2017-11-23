package chap10.arrayVlockingQueueTest1;

import java.util.Date;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by hjy on 17-11-23.
 * 3
 Thu Nov 23 14:29:55 CST 2017

 *
 * 阻塞了，出现阻塞的原因是new ArrayBlockingQueue(3)只创建了容纳3个元素的集合，所以当添加到第四个时添加不了，就呈阻塞状态，等待某一时间有空余时间再继续添加
 * 方法put()是存放数据，如果没有空余的空间存放数据时，则呈阻塞状态，其实在获取元素时没有元素可获取，也会呈阻塞状态
 */
public class Put {

    public static void main(String[] args) throws InterruptedException{
        ArrayBlockingQueue queue = new ArrayBlockingQueue(3);
        queue.put("a1");
        queue.put("a2");
        queue.put("a3");
        System.out.println(queue.size());
        System.out.println(new Date());
        queue.put("a4");
        System.out.println(new Date());
    }

}
