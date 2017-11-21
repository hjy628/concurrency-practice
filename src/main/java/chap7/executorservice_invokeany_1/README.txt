方法invokeAny()取得第一个完成任务的结果值 ,在这个过程中出现两种情况
1:无if(Thread.currentThread().isInterrupted())代码:已经获得第一个运行的结果值后，其他线程继续运行
2:有if(THread.currentThread().isInterrupted())代码:已经获得第一个运行的结果值后，其他线程如果使用throw new InterruptedException()代码，则这些线程中断
虽然throw抛出了异常，但在main线程中并不能捕获异常。如果想捕获异常，则需要在Callable中使用try-catch显式进行捕获