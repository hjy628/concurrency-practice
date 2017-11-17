package chap4.test26.myrunnable;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-16.
 */
public class MyRunnableA implements Runnable{

    private String userName;

    public MyRunnableA(String userName) {
        super();
        this.userName = userName;
    }

    @Override
    public void run() {

            for (int i = 0; i < Integer.MAX_VALUE / 50; i++) {
                String newString1 = new String();
                String newString5 = new String();
                String newString6 = new String();
                String newString7 = new String();
                Math.random();
                Math.random();
                Math.random();
            }

            System.out.println(Thread.currentThread().getName()+"任务成功完成!");

    }
}
