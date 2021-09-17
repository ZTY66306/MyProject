package com.heima.cpu2;

public class MyDemo extends Thread{
    public MyDemo() {
    }

    public MyDemo(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(getName()+"aaa"+i);
        }
    }
}
