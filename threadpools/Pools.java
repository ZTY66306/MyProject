package com.heima.threadpools;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Pools {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();


//        如果线程池是空的，会自动创建一个线程对象填充进去
        executorService.submit(()->
        {
            System.out.println(Thread.currentThread().getName()+"执行了");
        });

//        执行完毕了会把线程归还给池子

        Thread.sleep(2000);

//        线程池当中有可以执行任务的线程就不会创建新的线程

        executorService.submit(()->
        {
            System.out.println(Thread.currentThread().getName()+"执行了");
        });

//        把池子砸了

        executorService.shutdown();
    }
}
