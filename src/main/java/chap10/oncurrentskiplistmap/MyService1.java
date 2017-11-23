package chap10.oncurrentskiplistmap;

import java.util.concurrent.ConcurrentSkipListMap;

/**
 * Created by hjy on 17-11-23.
 */
public class MyService1 {

    public ConcurrentSkipListMap map = new ConcurrentSkipListMap();

    public MyService1() {

        UserInfo userInfo1 = new UserInfo(1,"username1");
        UserInfo userInfo3 = new UserInfo(3,"username3");
        UserInfo userInfo5 = new UserInfo(5,"username5");
        UserInfo userInfo4 = new UserInfo(4,"username4");
        UserInfo userInfo2 = new UserInfo(2,"username2");

        map.put(userInfo1,"value1");
        map.put(userInfo3,"value3");
        map.put(userInfo5,"value5");
        map.put(userInfo4,"value4");
        map.put(userInfo2,"value2");
    }
}
