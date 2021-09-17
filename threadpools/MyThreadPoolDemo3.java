package com.heima.threadpools;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;


//线程当中的变量是变量副本，为了提高运算速度    volatile关键字强制线程检查原始变量
//synchronized同步代码块执行步骤为   线程获得锁、清空变量副本、拷贝最新的共享变量到变量副本当中、执行代码、释放锁  也是强制线程看最新的变量
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
