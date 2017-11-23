package chap10.copyonwriteArrayList;

import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-23.\
 * Exception in thread "Thread-6" Exception in thread "Thread-2" java.lang.ArrayIndexOutOfBoundsException: 549
 at java.util.ArrayList.add(ArrayList.java:459)
 at chap10.copyonwriteArrayList.ThreadA.run(ThreadA.java:19)
 java.lang.ArrayIndexOutOfBoundsException: 244
 at java.util.ArrayList.add(ArrayList.java:459)
 at chap10.copyonwriteArrayList.ThreadA.run(ThreadA.java:19)
 Exception in thread "Thread-50" java.lang.ArrayIndexOutOfBoundsException: 4164
 at java.util.ArrayList.add(ArrayList.java:459)
 at chap10.copyonwriteArrayList.ThreadA.run(ThreadA.java:19)\
 *
 * 一定概率会出现异常
 */
public class Test1 {

    public static void main(String[] args) throws InterruptedException{
        MyServiceA service = new MyServiceA();

        Thread[] aArray = new Thread[100];

        for (int i = 0; i < aArray.length; i++) {
            aArray[i]= new ThreadA(service);
        }

        for (int i = 0; i < aArray.length; i++) {
            aArray[i].start();
        }

        TimeUnit.SECONDS.sleep(3);

        System.out.println(service.list.size());
    }

}
