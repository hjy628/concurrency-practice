package chap6.executor_completion_service_2;

import java.util.concurrent.*;

/**
 * Created by hjy on 17-11-20.
 * 从运行结果看，方法poll()返回的Future为null,因为当前没有任何已完成任务的Future对象，所以返回值为null,证明poll()方法不像take()方法具有阻塞的效果
 */
public class Run {
    public static void main(String[] args) {
            ExecutorService executorService = Executors.newCachedThreadPool();
            CompletionService csRef = new ExecutorCompletionService(executorService);

            for (int i = 0; i < 1; i++) {
                csRef.submit(new Callable() {
                    @Override
                    public Object call() throws Exception {
                        TimeUnit.SECONDS.sleep(3);
                        System.out.println("3秒过后了");
                        return "测试3s";
                    }
                });
            }

            for (int i = 0; i < 1; i++) {
                System.out.println(csRef.poll());
            }
    }
}
