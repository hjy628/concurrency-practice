package chap9.method7;


import chap9.method7.entity.UserInfo;
import chap9.method7.myrunnable.MyRunnable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 */
public class Run2 {

    public static void main(String[] args) throws InterruptedException,ExecutionException{

        UserInfo userInfo = new UserInfo();

        MyRunnable runnable = new MyRunnable(userInfo);
        ForkJoinPool pool = new ForkJoinPool();
        pool.submit(runnable,userInfo);
        TimeUnit.SECONDS.sleep(2);
        //上面使用sleep不标准，因为执行时间不固定
        //如果打印的早则有可能出现打印null值的情况
        System.out.println("userinfo username="+userInfo.getUsername());
        TimeUnit.SECONDS.sleep(5);
    }

}
