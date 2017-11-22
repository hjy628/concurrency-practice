package chap9.method12;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 * A:false
 打印了! begin ForkJoinPool-1-worker-1
 java.lang.InterruptedException: sleep interrupted
 at java.lang.Thread.sleep(Native Method)
 at java.lang.Thread.sleep(Thread.java:340)
 at java.util.concurrent.TimeUnit.sleep(TimeUnit.java:386)
 at chap9.method12.Run1$1.run(Run1.java:17)
 at java.util.concurrent.ForkJoinTask$RunnableExecuteAction.exec(ForkJoinTask.java:1402)
 at java.util.concurrent.ForkJoinTask.doExec(ForkJoinTask.java:289)
 at java.util.concurrent.ForkJoinPool$WorkQueue.runTask(ForkJoinPool.java:1056)
 at java.util.concurrent.ForkJoinPool.runWorker(ForkJoinPool.java:1689)
 at java.util.concurrent.ForkJoinWorkerThread.run(ForkJoinWorkerThread.java:157)
 B:true
 *
 * 任务成功被运行，由于shutdownNow()方法在源代码内部使用了interrupt()方法，所以interrupt()方法遇到sleep()抛出
 * java.lang.InterruptedException: sleep interrupted　异常
 * 如果使用Callable接口，则需要使用Future对象的get()方法获得异常
 */
public class Run1 {

    public static void main(String[] args) throws InterruptedException{
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("打印了! begin "+Thread.currentThread().getName());
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("打印了! end "+Thread.currentThread().getName());
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        ForkJoinPool pool = new ForkJoinPool();
        pool.execute(runnable);
        System.out.println("A:"+pool.isShutdown());
        pool.shutdownNow();
        TimeUnit.SECONDS.sleep(5);
        System.out.println("B:"+pool.isShutdown());




    }

}
