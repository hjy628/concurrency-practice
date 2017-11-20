方法execute()没有返回值，而submit()方法可以有返回值
方法execute()在默认的情况下异常直接抛出，不能捕获，但可以通过自定义Thread-Factory的方式进行捕获，
而submit()方法在默认的情况下，可以通过catch Execution-Exeception捕获异常
