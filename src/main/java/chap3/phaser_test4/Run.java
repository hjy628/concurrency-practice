package chap3.phaser_test4;

import java.util.concurrent.Phaser;

/**
 * Created by hjy on 17-11-15.
 */
public class Run {

    public static void main(String[] args) {
        Phaser phaser = new Phaser(5);
        System.out.println(phaser.getRegisteredParties());

        phaser.register();
        System.out.println(phaser.getRegisteredParties());

        phaser.register();
        System.out.println(phaser.getRegisteredParties());

        phaser.register();
        System.out.println(phaser.getRegisteredParties());

        phaser.register();
        System.out.println(phaser.getRegisteredParties());


    }

}
