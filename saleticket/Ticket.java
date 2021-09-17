package com.heima.saleticket;

public class Ticket implements Runnable {
    private int ticket = 100;
    private Object obj = new Object();

    @Override
    public void run() {
        while (true) {
//            obj为锁对象
            synchronized (obj){
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
            }
        }
    }
}
