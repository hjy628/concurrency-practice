package chap5.rejected_execution_handler_test.myrunnable;

import chap5.rejected_execution_handler_test.Run;

/**
 * Created by hjy on 17-11-20.
 */
public class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String name) {
        super();
        this.name = name;
    }


    @Override
    public void run() {
        System.out.println(name+" 在运行!");
    }
}
