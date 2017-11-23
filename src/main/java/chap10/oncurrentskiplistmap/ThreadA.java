package chap10.oncurrentskiplistmap;

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
                Map.Entry entry = service1.map.pollFirstEntry();
                UserInfo userInfo = (UserInfo)entry.getKey();
                System.out.println(userInfo.getId()+" "+userInfo.getUsername()+" "+entry.getValue());
                TimeUnit.SECONDS.sleep((int)Math.random());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
