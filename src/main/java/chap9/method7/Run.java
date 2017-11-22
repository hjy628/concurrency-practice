package chap9.method7;


import chap9.method7.entity.UserInfo;
import chap9.method7.myrunnable.MyRunnable;

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 */
public class Run {

    public static void main(String[] args) throws InterruptedException,ExecutionException{

        UserInfo userInfo = new UserInfo();

        MyRunnable runnable = new MyRunnable(userInfo);
        ForkJoinPool pool = new ForkJoinPool();
        pool.submit(runnable,userInfo);
        //取不到值
        System.out.println("userinfo username="+userInfo.getUsername());
        TimeUnit.SECONDS.sleep(5);
    }

}
