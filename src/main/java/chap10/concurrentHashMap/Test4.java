package chap10.concurrentHashMap;


import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-23.
 * String5
 Exception in thread "Thread-0" java.util.ConcurrentModificationException
 at java.util.Hashtable$Enumerator.next(Hashtable.java:1367)
 at chap10.concurrentHashMap.Thread4A.run(Thread4A.java:23)
 *
 * 说明HashTable在获得了Iterator对象后，不允许更改其结构，否则出现java.util.ConcurrentModificationException异常
 * 但ConcurrentHashMap却支持这个功能
 *
 */
public class Test4 {

    public static void main(String[] args) throws InterruptedException{
        MyService4 service = new MyService4();

        Thread4A a = new Thread4A(service);
        a.start();

        TimeUnit.SECONDS.sleep(1);

        Thread4B b = new Thread4B(service);

        b.start();

    }

}
