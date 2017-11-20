package chap5.execute_submit_diff;

import java.util.concurrent.*;

/**
 * Created by hjy on 17-11-20.
 */
public class Run2 {
    public static void main(String[] args) {
        try {
            ExecutorService executor = new ThreadPoolExecutor(50,Integer.MAX_VALUE,5, TimeUnit.SECONDS,new LinkedBlockingDeque<>());
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    Integer.parseInt("a");
                }
            });
            Future future = executor.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    Integer.parseInt("a");
                    return "我是返回值";
                }
            });
            System.out.println(future.get());
        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (ExecutionException e){
            System.out.println("能捕获异常");
            e.printStackTrace();
        }
    }
}
