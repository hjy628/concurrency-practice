package chap1.t11.service;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-14.
 */
public class Service {
   // private Semaphore semaphore = new Semaphore(1);
    private Semaphore semaphore = new Semaphore(2); //参数值大于一时，不保证线程安全性，

    public void testMethod(){
        try {
            semaphore.acquire();    //无参方法作用是使用一个许可，是减法操作
            System.out.println(Thread.currentThread().getName()+" begin timer"+System.currentTimeMillis());
            TimeUnit.SECONDS.sleep(5);
            System.out.println(Thread.currentThread().getName()+"   end timer"+System.currentTimeMillis());
            semaphore.release();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
