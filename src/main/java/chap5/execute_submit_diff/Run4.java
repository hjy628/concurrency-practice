package chap5.execute_submit_diff;

import java.util.concurrent.*;

/**
 * Created by hjy on 17-11-20.
 */
public class Run4 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(50,Integer.MAX_VALUE,5, TimeUnit.SECONDS,new LinkedBlockingDeque<>());
            executor.setThreadFactory(new ThreadFactory() {
                @Override
                public Thread newThread(Runnable r) {
                    Thread t = new Thread(r);
                    t.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                        @Override
                        public void uncaughtException(Thread t, Throwable e) {
                            System.out.println("execute()方法通过自定义");
                            System.out.println("ThreadFactory也能捕获异常了");
                            e.printStackTrace();
                        }
                    });
                    return t;
                }
            });

        executor.execute(new Runnable() {
            @Override
            public void run() {
                Integer.parseInt("a");
            }
        });


    }
}
