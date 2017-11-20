接口callable与线程功能密不可分，但和runnable的主要区别为:
    Callable接口的call()方法可以有返回值，而Runnable接口的run()方法没有返回值
    Callable接口的call()方法可以声明抛出异常，而Runnable接口的run方法不可以声明抛出异常
执行完Callable接口中的任务后，返回值是通过Future接口进行获得的