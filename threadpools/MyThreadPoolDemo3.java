package com.heima.threadpools;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyThreadPoolDemo3 {
    public static void main(String[] args) {
//        Array 为任务队列
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2,5,2, TimeUnit.SECONDS,new ArrayBlockingQueue<>(10),
//                默认创建线程的工厂和默认的拒绝策略
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

//        向线程池当中添加任务  添加了2个任务
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());

        pool.shutdown();
    }
}
