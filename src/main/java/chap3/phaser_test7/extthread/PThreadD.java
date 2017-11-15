package chap3.phaser_test7.extthread;

import java.util.Date;
import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-15.
 */
public class PThreadD extends Thread{

    private Phaser phaser;

    public PThreadD(Phaser phaser) {
        super();
        this.phaser = phaser;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+" A1 begin="+new Date());
            TimeUnit.SECONDS.sleep(5);
            phaser.arriveAndAwaitAdvance();
            System.out.println(Thread.currentThread().getName()+" A1 end="+new Date());

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
