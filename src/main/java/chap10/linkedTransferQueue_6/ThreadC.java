package chap10.linkedTransferQueue_6;


import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-23.
 */
public class ThreadC extends Thread{

    private MyServiceC service;

    public ThreadC(MyServiceC service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        try {

            System.out.println("取得的值: "+service.queue.take());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
