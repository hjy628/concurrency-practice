package chap10.concurrentHashMap;

import java.util.Hashtable;

/**
 * Created by hjy on 17-11-23.
 */
public class MyService4 {

    public static Hashtable hashtable = new Hashtable();

    public MyService4() {
        for (int i = 0; i < 5; i++) {
            hashtable.put("String"+(i+1),i+1);
        }
    }
}
