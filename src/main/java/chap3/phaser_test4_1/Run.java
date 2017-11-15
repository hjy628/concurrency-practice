package chap3.phaser_test4_1;

import java.util.concurrent.Phaser;

/**
 * Created by hjy on 17-11-15.
 * bulkRegister() 批量增加parties数量
 */
public class Run {

    public static void main(String[] args) {
        Phaser phaser = new Phaser(10);
        System.out.println(phaser.getRegisteredParties());

        phaser.bulkRegister(10);
        System.out.println(phaser.getRegisteredParties());

        phaser.bulkRegister(10);
        System.out.println(phaser.getRegisteredParties());

        phaser.bulkRegister(10);
        System.out.println(phaser.getRegisteredParties());

        phaser.bulkRegister(10);
        System.out.println(phaser.getRegisteredParties());


    }

}
