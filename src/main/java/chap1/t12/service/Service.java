package chap1.t12.service;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-14.
 */
public class Service {
    private Semaphore semaphore = new Semaphore(10); //参数值大于一时，不保证线程安全性，

    public void testMethod(){
        try {
            semaphore.acquire(2);    //是使用2个许可，是减法操作
            System.out.println(Thread.currentThread().getName()+" begin timer"+System.currentTimeMillis());
            int sleepValue = ((int)(Math.random()*10000));
            System.out.println(Thread.currentThread().getName()+"  停止了　"+sleepValue/1000 +"秒");
            TimeUnit.MILLISECONDS.sleep(sleepValue);
            System.out.println(Thread.currentThread().getName()+"   end timer"+System.currentTimeMillis());
            semaphore.release(2);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
