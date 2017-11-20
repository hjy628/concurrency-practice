package chap5.execute_submit_diff;

import java.util.concurrent.*;

/**
 * Created by hjy on 17-11-20.
 */
public class Run {
    public static void main(String[] args) {
        try {
            ExecutorService executor = new ThreadPoolExecutor(50,Integer.MAX_VALUE,5, TimeUnit.SECONDS,new LinkedBlockingDeque<>());
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("execute()方法执行了，没有返回值");
                }
            });
            Future future = executor.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    System.out.println("submit() 方法执行了，有返回值");
                    return "我是返回值";
                }
            });
            System.out.println(future.get());
        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (ExecutionException e){
            e.printStackTrace();
        }
    }
}
