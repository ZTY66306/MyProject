package com.heima.cpu2;

public class Demo {
    public static void main(String[] args) {
        MyDemo t1= new MyDemo();
        Thread t2=new Thread(t1);
        t2.start();
        System.out.println("dsad");
//        run 方法没有开启线程
    }
}
