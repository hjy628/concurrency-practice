package chap5.future_callable_3.mycallable;

import chap5.future_callable_3.entity.UserInfo;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-20.
 */
public class MyRunnable implements Runnable{
    private UserInfo userInfo;

    public MyRunnable(UserInfo userInfo) {
        super();
        this.userInfo = userInfo;
    }

    @Override
    public void run()  {
        userInfo.setUsername("usernameValue");
        userInfo.setPassword("passwordValue");
    }
}
