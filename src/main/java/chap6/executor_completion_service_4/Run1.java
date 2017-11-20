package chap6.executor_completion_service_4;


import chap6.executor_completion_service_4.entity.UserInfo;
import chap6.executor_completion_service_4.mycallable.MyRunnable;

import java.util.concurrent.*;

/**
 * Created by hjy on 17-11-20.
 */
public class Run1 {
    public static void main(String[] args) throws InterruptedException,ExecutionException{

        UserInfo userInfo = new UserInfo();

        MyRunnable runnable = new MyRunnable(userInfo);


            ExecutorService executorService = Executors.newCachedThreadPool();
            CompletionService csRef = new ExecutorCompletionService(executorService);

        Future<UserInfo> future = csRef.submit(runnable,userInfo);
        System.out.println(future.get().getUsername()+"---"+future.get().getPassword());

    }
}
