package chap10.delayQueueTest1;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-23.
 */
public class UserInfo implements Delayed{

    private long delayNanoTime;//延迟的纳秒
    private String username;

    public UserInfo(long delayNanoTime,String username) {
        super();
        this.username = username;
        TimeUnit unit = TimeUnit.SECONDS;
        this.delayNanoTime = System.nanoTime()+unit.toNanos(delayNanoTime);
    }

    public String getUsername() {
        return username;
    }

    public long getDelayNanoTime() {
        return delayNanoTime;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(delayNanoTime-System.nanoTime(),TimeUnit.NANOSECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        if ((this.getDelay(TimeUnit.NANOSECONDS)-o.getDelay(TimeUnit.NANOSECONDS))<0){
            return -1;
        }
        if ((this.getDelay(TimeUnit.NANOSECONDS)-o.getDelay(TimeUnit.NANOSECONDS))>0){
            return 1;
        }


        return 0;
    }
}
