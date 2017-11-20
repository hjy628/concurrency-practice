package chap5.test10.mycallable;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-20.
 */
public class MyCallable implements Callable<String>{


    @Override
    public String call() throws Exception {
        int i = 0;
        while (i==0){
            TimeUnit.MILLISECONDS.sleep(200);
            System.out.println("AAAAAAA");
        }
        return "我的年龄是：100 ";
    }
}
