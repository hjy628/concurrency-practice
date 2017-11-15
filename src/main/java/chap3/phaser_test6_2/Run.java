package chap3.phaser_test6_2;



import chap3.phaser_test6_2.extthread.PThreadA;
import chap3.phaser_test6_2.extthread.PThreadB;
import chap3.phaser_test6_2.extthread.PThreadC;
import chap3.phaser_test6_2.service.MyService;

import java.util.concurrent.Phaser;

/**
 * Created by hjy on 17-11-15.
 *
 *
 */
public class Run {

    public static void main(String[] args) throws InterruptedException{

        Phaser phaser = new Phaser(3);

        MyService service = new MyService(phaser);

        PThreadA a = new PThreadA(service);
        a.setName("A");
        a.start();

        PThreadB b = new PThreadB(service);
        b.setName("B");
        b.start();

        PThreadC c = new PThreadC(service);
        c.setName("C");
        c.start();
    }

}
