package com.heima.cpu2;

import com.sun.org.apache.xerces.internal.util.FeatureState;

import java.util.concurrent.FutureTask;

public class Demo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Mycallable t1= new Mycallable();
        FutureTask<String> fi=new FutureTask<>(t1);
        Thread t=new Thread(fi);
        System.out.println(t.getPriority());
//        线程的休闲几越高，抢到cpu的几率越高
        t.setPriority(5);
        t.setName("飞机");

//        t.start();
//        run 方法没有开启线程
    }
}
