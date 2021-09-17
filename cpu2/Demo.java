package com.heima.cpu2;

public class Demo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyDemo t1= new MyDemo("小强");
//        t1.start();
//        run 方法没有开启线程
    }
}
