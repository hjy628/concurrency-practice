接口Future具有阻塞同步性，这样的代码运行效率会大打折扣，接口CompletionService可以解决这样的问题
本示例中使用CompletionService接口中的take()方法，它的主要作用就是取得Future对象
方法声明结构如下：
public Future<V> take() throws InterruptedException
