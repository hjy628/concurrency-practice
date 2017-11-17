package chap4.get_diff.extthread;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-17.
 */
public class GMyThreadA extends Thread{

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+ " begin "+new Date() + " 运行中 ");
            TimeUnit.SECONDS.sleep(5);
            System.out.println(Thread.currentThread().getName()+ " end "+new Date() + " 运行中 ");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
