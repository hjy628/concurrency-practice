package chap3.phaser_test9;

import chap3.phaser_test9.extthread.PThreadA;
import chap3.phaser_test9.extthread.PThreadB;

import java.util.Date;
import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-15.
 */
public class Run2 {

    public static void main(String[] args) throws InterruptedException{
        Phaser phaser = new Phaser(3);

        PThreadA a = new PThreadA(phaser);
        a.setName("A");
        a.start();
        PThreadB b = new PThreadB(phaser);
        b.setName("B");
        b.start();


        TimeUnit.SECONDS.sleep(1);
        phaser.forceTermination();  //使Phaser对象的屏障功能失效
        System.out.println(phaser.isTerminated());  //判断Phaser对象是否已经呈销毁状态

    }

}
