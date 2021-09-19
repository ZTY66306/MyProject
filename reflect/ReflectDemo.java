package com.heima.reflect;

import java.lang.reflect.Constructor;

public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {

//        三种方式得到class对象

//        method1();

    }

    private static void method1() throws ClassNotFoundException {
        //      源代码阶段获取Class对象,Class类中的静态方法  Class.forname()
        Class clazz = Class.forName("com.heima.reflect.Student");
        System.out.println(clazz);


//      类型.class
        Class clazz2=Student.class;
        System.out.println(clazz2);

//      对象.getclass()
        Student s=new Student();
        Class clazz3 = s.getClass();
        System.out.println(clazz3);
    }
}
