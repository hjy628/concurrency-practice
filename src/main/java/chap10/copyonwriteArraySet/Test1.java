package chap10.copyonwriteArraySet;

import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-23.
 *  HashSet并不安全，没有达到预期值10000
 *
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

        System.out.println(service.set.size());
    }

}
