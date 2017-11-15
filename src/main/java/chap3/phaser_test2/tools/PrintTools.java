package chap3.phaser_test2.tools;

import java.util.Date;
import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-15.
 */
public class PrintTools {

    public static Phaser phaser;

    public static void methodA(){
        System.out.println(Thread.currentThread().getName()+" A1 begin = " +new Date());
        phaser.arriveAndAwaitAdvance();
        System.out.println(Thread.currentThread().getName()+" A1 end = " +new Date());
        System.out.println(Thread.currentThread().getName()+" A2 begin = " +new Date());
        phaser.arriveAndAwaitAdvance();
        System.out.println(Thread.currentThread().getName()+" A2 end = " +new Date());

    }


    public static void methodB(){
        try {
            System.out.println(Thread.currentThread().getName()+" A1 begin = " +new Date());
            TimeUnit.SECONDS.sleep(5);
            System.out.println("A:  "+phaser.getRegisteredParties());
            phaser.arriveAndDeregister();
            System.out.println("B:  "+phaser.getRegisteredParties());
            System.out.println(Thread.currentThread().getName()+" A1 end = " +new Date());
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

}
