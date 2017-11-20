package chap6.executor_completion_service_1;

import chap5.future_last.mycallable.MyCallable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by hjy on 17-11-20.
 * 从结果看，方法take()是按任务执行的速度，从快到慢的顺序获得Future对象，因为打印的时间是从小到大
 */
public class Run {
    public static void main(String[] args) {
        try {

            //take()方法：获取并移除表示下一个已完成任务的Future,如果目前不存在这样的任务，则等待
            ExecutorService executorService = Executors.newCachedThreadPool();
            CompletionService csRef = new ExecutorCompletionService(executorService);

            for (int i = 0; i < 10; i++) {
                csRef.submit(new Callable() {
                    @Override
                    public Object call() throws Exception {
                        long sleepValue = (int)(Math.random()*1000);
                        System.out.println("sleep="+sleepValue + " - "+Thread.currentThread().getName());
                        TimeUnit.MILLISECONDS.sleep(sleepValue);
                        return "测试:"+sleepValue+" - "+Thread.currentThread().getName();
                    }
                });
            }

            for (int i = 0; i < 10; i++) {
                System.out.println(csRef.take().get());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (ExecutionException e){
            e.printStackTrace();
        }
    }
}
