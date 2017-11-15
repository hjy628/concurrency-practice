package chap3.phaser_test8_3.extthread;

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
        try {
            System.out.println(Thread.currentThread().getName()+" A1 begin="+new Date());
            phaser.awaitAdvanceInterruptibly(10);   //不符合栏数就继续运行
            System.out.println(Thread.currentThread().getName()+" A1 end="+new Date());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
