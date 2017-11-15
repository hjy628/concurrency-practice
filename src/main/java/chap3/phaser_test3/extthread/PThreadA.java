package chap3.phaser_test3.extthread;


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
        System.out.println("A begin");
        phaser.arriveAndAwaitAdvance();
        System.out.println("A  end phase value= " + phaser.getPhase());

        System.out.println("A begin");
        phaser.arriveAndAwaitAdvance();
        System.out.println("A  end phase value= " + phaser.getPhase());

        System.out.println("A begin");
        phaser.arriveAndAwaitAdvance();
        System.out.println("A  end phase value= " + phaser.getPhase());

        System.out.println("A begin");
        phaser.arriveAndAwaitAdvance();
        System.out.println("A  end phase value= " + phaser.getPhase());
    }
}
