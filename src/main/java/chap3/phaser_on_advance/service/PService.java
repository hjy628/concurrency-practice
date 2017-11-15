package chap3.phaser_on_advance.service;

import java.util.Date;
import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-15.
 */
public class PService {

    private Phaser phaser;

    public PService(Phaser phaser) {
        super();
        this.phaser = phaser;
    }

    public void testMethod(){
        try {
            System.out.println("A begin ThreadName="+Thread.currentThread().getName()+"    "+new Date());
            if (Thread.currentThread().getName().equals("B")){
                TimeUnit.SECONDS.sleep(5);
            }
            phaser.arriveAndAwaitAdvance();
            System.out.println("A end ThreadName="+Thread.currentThread().getName()+" end phase value="+phaser.getPhase()+"  "+new Date());

            System.out.println("B begin ThreadName="+Thread.currentThread().getName()+"    "+new Date());
            if (Thread.currentThread().getName().equals("B")){
                TimeUnit.SECONDS.sleep(5);
            }
            phaser.arriveAndAwaitAdvance();
            System.out.println("B end ThreadName="+Thread.currentThread().getName()+" end phase value="+phaser.getPhase()+"  "+new Date());

            System.out.println("C begin ThreadName="+Thread.currentThread().getName()+"    "+new Date());
            if (Thread.currentThread().getName().equals("B")){
                TimeUnit.SECONDS.sleep(5);
            }
            phaser.arriveAndAwaitAdvance();
            System.out.println("C end ThreadName="+Thread.currentThread().getName()+" end phase value="+phaser.getPhase()+"  "+new Date());

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
