package chap3.phaser_test8_4.extthread;

import java.util.Date;
import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

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
            phaser.awaitAdvanceInterruptibly(0,5, TimeUnit.SECONDS);   //指定的栏数等待最大的单位时间，如果在指定的时间内，栏数未变，则出现异常，否则继续向下运行
            System.out.println(Thread.currentThread().getName()+" A1 end="+new Date());
        }catch (InterruptedException e){
            System.out.println("InterruptedException");
            e.printStackTrace();
        }catch (TimeoutException e){
            System.out.println("TimeoutException");
            e.printStackTrace();
        }
    }
}
