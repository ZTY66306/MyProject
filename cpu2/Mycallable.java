package com.heima.cpu2;

import java.util.Calendar;
import java.util.concurrent.Callable;

public class Mycallable implements Callable<String>{

    @Override
    public String call() throws Exception {
        for (int i = 0; i <100 ; i++) {
            System.out.println(i);

        }
        return "完毕'";
    }
}
