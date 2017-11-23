package chap10.concurrentHashMap;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by hjy on 17-11-23.
 */
public class MyService5 {

    public ConcurrentHashMap map = new ConcurrentHashMap();

    public MyService5() {
        for (int i = 0; i < 5; i++) {
            map.put("key"+(i+1),"value"+(i+1));
        }
    }
}
