方法invokeAny()和invokeAll()具有阻塞特性
方法invokeAny()取得第一个完成任务的结果值，当第一个任务完成后,会调用interrupt()方法将其他任务中断,
所以在这些任务中可以结合if(Thread.currentThread().isInterrupted()==true)代码来决定任务是否继续运行
方法invokeAll()等全部线程任务执行完毕后，取得全部完成任务的结果值