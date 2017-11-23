package chap10.oncurrentskiplistset;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-23.
 */
public class ThreadA extends Thread{

    private MyService1 service1;

    public ThreadA(MyService1 service1) {
        super();
        this.service1 = service1;
    }

    @Override
    public void run() {
        try {
            while (!service1.map.isEmpty()){
                UserInfo userInfo = (UserInfo)service1.map.pollFirst();
                System.out.println(userInfo.getId()+" "+userInfo.getUsername());
                TimeUnit.SECONDS.sleep((int)Math.random());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
