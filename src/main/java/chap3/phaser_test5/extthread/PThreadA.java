package chap3.phaser_test5.extthread;

import java.util.Date;
import java.util.concurrent.Phaser;

/**
 * Created by hjy on 17-11-15.
 */
public class PThreadA extends Thread{

    private Phaser phaser;

    public PThreadA(Phaser phaser) {
        super();
        this.phaser = phaser;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" A1 begin="+new Date());
        phaser.arriveAndAwaitAdvance();
        System.out.println(Thread.currentThread().getName()+" A1 end="+new Date());
    }
}
