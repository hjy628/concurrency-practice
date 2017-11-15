package chap3.phaser_test5;

import chap3.phaser_test5.extthread.PThreadA;

import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-15.
 * getArrivedParties()获得已经被使用的parties个数
 * getUnarrivedParties()获得未被使用的parties个数
 */
public class Run {

    public static void main(String[] args) throws InterruptedException{
        Phaser phaser = new Phaser(7);

        PThreadA[] threadArray = new PThreadA[5];

        for (int i = 0; i < threadArray.length; i++) {
            threadArray[i] = new PThreadA(phaser);
            threadArray[i].setName("Thread"+(i+1));
            threadArray[i].start();
        }
        TimeUnit.SECONDS.sleep(2);

        System.out.println("已到达: "+phaser.getArrivedParties());
        System.out.println("未到达: "+phaser.getUnarrivedParties());

    }

}
