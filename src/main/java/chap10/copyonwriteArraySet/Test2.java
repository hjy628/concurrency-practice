package chap10.copyonwriteArraySet;

import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-23.
 *
 */
public class Test2 {

    public static void main(String[] args) throws InterruptedException{
        MyServiceB service = new MyServiceB();

        Thread[] aArray = new Thread[100];

        for (int i = 0; i < aArray.length; i++) {
            aArray[i]= new ThreadB(service);
        }

        for (int i = 0; i < aArray.length; i++) {
            aArray[i].start();
        }

        TimeUnit.SECONDS.sleep(3);

        System.out.println(service.set.size());

    }

}
