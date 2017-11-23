package chap10.concurrentHashMap;


import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-23.
 *
 *  既要求并发安全又要求排序的情况可以使用类ConcurrentSkipListMap
 *
 */
public class Test5 {

    public static void main(String[] args) throws InterruptedException{
        MyService5 service = new MyService5();

        Thread5A a = new Thread5A(service);
        a.start();

        TimeUnit.SECONDS.sleep(1);

        Thread5B b = new Thread5B(service);

        b.start();

        //成功但不支持排序
        //LinkedHashMap虽然能支持顺序性，但又不支持并发
    }

}
