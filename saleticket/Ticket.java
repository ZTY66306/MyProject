package com.heima.saleticket;

import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable {
    private int ticket = 100;
    private Object obj = new Object();
    private ReentrantLock lock = new ReentrantLock();


    @Override
    public void run() {
        while (true) {
//            obj为锁对象，锁对象一定要是唯一的  同步方法的锁对象为this
//            同步静态方法的锁对象为当前类的字节码对象  死锁是锁的嵌套导致的
            synchronized (obj) {
                try {
                    if (ticket == 0) {
                        break;
                    } else {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        ticket--;
                        System.out.println(Thread.currentThread().getName() + "还剩下" + ticket);

                    }
                } finally {

                }
            }
        }
    }
}
