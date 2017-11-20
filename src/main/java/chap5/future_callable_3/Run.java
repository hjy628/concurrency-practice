package chap5.future_callable_3;

import chap5.future_callable_3.entity.UserInfo;
import chap5.future_callable_3.mycallable.MyRunnable;

import java.util.Date;
import java.util.concurrent.*;

/**
 * Created by hjy on 17-11-20.
 * 从控制台打印的及结果来看，方法get()具有阻塞特性
 */
public class Run {

    public static void main(String[] args) throws InterruptedException,ExecutionException{


        UserInfo userInfo = new UserInfo();
        MyRunnable runnable = new MyRunnable(userInfo);


        ThreadPoolExecutor executor = new ThreadPoolExecutor(10,10,10,TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());
        Future<UserInfo> future = executor.submit(runnable,userInfo);
        System.out.println("begin time = "+new Date());
        //userInfo = future.get();
        System.out.println("get value "+userInfo.getUsername()+"--"+userInfo.getPassword());
        System.out.println("end time = "+new Date());


    }

}
