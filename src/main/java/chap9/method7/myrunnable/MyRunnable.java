package chap9.method7.myrunnable;

import chap9.method7.entity.UserInfo;

import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 */
public class MyRunnable implements Runnable{

    private UserInfo userInfo;

    public MyRunnable(UserInfo userInfo) {
        super();
        this.userInfo = userInfo;
    }

    @Override
    public void run() {
        try {
            userInfo.setUsername("设置的值");
            System.out.println("已设置完结");
            TimeUnit.SECONDS.sleep(3);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
