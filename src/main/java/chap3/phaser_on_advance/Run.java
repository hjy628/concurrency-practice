package chap3.phaser_on_advance;

import chap3.phaser_on_advance.extthread.PThreadA;
import chap3.phaser_on_advance.extthread.PThreadB;
import chap3.phaser_on_advance.service.PService;

import java.util.concurrent.Phaser;

/**
 * Created by hjy on 17-11-15.
 */
public class Run {

    public static void main(String[] args) {
        Phaser phaser = new Phaser(2){
            @Override
            protected boolean onAdvance(int phase, int registeredParties) {
                System.out.println("proctected boolean onAdvance(int phase,int registered Parties)　被调用!");
                //return true;
                return false;
                //返回true不等待了，Phaser呈无效/销毁的状态
                //返回false则Phaser继续工作
            }
        };

        PService service = new PService(phaser);

        PThreadA a = new PThreadA(service);
        a.setName("A");
        a.start();

        PThreadB b = new PThreadB(service);
        b.setName("B");
        b.start();

    }

}
