package chap6.executor_completion_service_0;

import chap5.future_last.mycallable.MyCallable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by hjy on 17-11-20.
 *  循环次数变成六次，则永远阻塞等待第六个结果，除非再提交一个任务给线程池
 */
public class Run2 {
    public static void main(String[] args) {
        try {
            MyCallable callable1 = new MyCallable("username1",5000);
            MyCallable callable2 = new MyCallable("username2",4000);
            MyCallable callable3 = new MyCallable("username3",3000);
            MyCallable callable4 = new MyCallable("username4",2000);
            MyCallable callable5 = new MyCallable("username5",1000);

            List<Callable> callableList = new ArrayList<Callable>();
            callableList.add(callable1);
            callableList.add(callable2);
            callableList.add(callable3);
            callableList.add(callable4);
            callableList.add(callable5);

            ThreadPoolExecutor executor = new ThreadPoolExecutor(5,10,5, TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());
            CompletionService csRef = new ExecutorCompletionService(executor);

            for (int i = 0; i < 5; i++) {
                csRef.submit(callableList.get(i));
            }

            for (int i = 0; i < 6; i++) {
                System.out.println("等待打印第"+(i+1)+"个返回值");
                System.out.println(csRef.take().get());
            }
            //按乱序打印的效果
            //说明一个Future对应当前先执行完的Callable任务
        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (ExecutionException e){
            e.printStackTrace();
        }
    }
}
