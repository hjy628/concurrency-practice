package chap9.method7;


import chap9.method7.entity.UserInfo;
import chap9.method7.myrunnable.MyRunnable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 */
public class Run3 {

    public static void main(String[] args) throws InterruptedException,ExecutionException{

        UserInfo userInfo = new UserInfo();

        MyRunnable runnable = new MyRunnable(userInfo);
        ForkJoinPool pool = new ForkJoinPool();
        Future<UserInfo> future =  pool.submit(runnable,userInfo);
        //建议用此种方式future.get()
        //因为get()方法呈阻塞效果
        System.out.println("userinfo username="+future.get().getUsername());
        TimeUnit.SECONDS.sleep(5);
    }

}
