package chap3.phaser_test6_2.service;

import java.util.Date;
import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-15.
 */
public class MyService {

    public Phaser phaser;

    public MyService(Phaser phaser) {
        super();
        this.phaser = phaser;
    }

    public void testMethodA(){
        try {
            System.out.println("A1 begin ThreadName="+Thread.currentThread().getName()+"    "+new Date());
            TimeUnit.SECONDS.sleep(3);
            System.out.println(phaser.getArrivedParties());
            phaser.arriveAndAwaitAdvance();
            System.out.println("A1 end ThreadName="+Thread.currentThread().getName() +"    "+new Date());

              System.out.println("A2 begin ThreadName="+Thread.currentThread().getName()+"    "+new Date());
            TimeUnit.SECONDS.sleep(3);
            System.out.println(phaser.getArrivedParties());
            phaser.arriveAndAwaitAdvance();
            System.out.println("A2 end ThreadName="+Thread.currentThread().getName()+" " +new Date());

              System.out.println("A3 begin ThreadName="+Thread.currentThread().getName()+"    "+new Date());
            TimeUnit.SECONDS.sleep(3);
            System.out.println(phaser.getArrivedParties());
            phaser.arriveAndAwaitAdvance();
            System.out.println("A3 end ThreadName="+Thread.currentThread().getName()+"    "+new Date());


        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void testMethodB(){
            System.out.println("A1 begin ThreadName="+Thread.currentThread().getName()+"    "+new Date());
            phaser.arrive();
            System.out.println("A1 end ThreadName="+Thread.currentThread().getName() +"    "+new Date());

              System.out.println("A2 begin ThreadName="+Thread.currentThread().getName()+"    "+new Date());
            phaser.arrive();
            System.out.println("A2 end ThreadName="+Thread.currentThread().getName() +"    "+new Date());

              System.out.println("A3 begin ThreadName="+Thread.currentThread().getName()+"    "+new Date());
            phaser.arrive();
            System.out.println("A3 end ThreadName="+Thread.currentThread().getName()+"    "+new Date());
    }
}
