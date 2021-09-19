package com.heima.zhujie;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Zhujie {
    public static void main(String[] args) {



    }
    @Test
    public void show(){
        int a = 20;
        int b = 25;
        System.out.println(a);
    }

    @Before
    public void before(){
        int a = 20;
        int b = 25;
        System.out.println("b");
    }
    @After
    public void after(){
        int a = 20;
        int b = 25;
        System.out.println("a");
    }



}
