package chap6.executor_completion_service_4.mycallable;


import chap6.executor_completion_service_4.entity.UserInfo;

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
        System.out.println("run 运行了");
    }
}
