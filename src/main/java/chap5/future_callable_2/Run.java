package chap5.future_callable_2;


import java.util.Date;
import java.util.concurrent.*;

/**
 * Created by hjy on 17-11-20.
 * 从控制台打印的及结果来看，方法get()具有阻塞特性
 */
public class Run {

    public static void main(String[] args) throws InterruptedException{

        try {

            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    System.out.println("打印的信息");
                }
            };


            ExecutorService executorService = Executors.newCachedThreadPool();
            Future future = executorService.submit(runnable);
            System.out.println(future.get() + "---" + future.isDone());
        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (ExecutionException e){
            e.printStackTrace();
        }

    }

}
