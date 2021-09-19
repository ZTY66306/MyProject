package com.heima.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class RelectField {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {

        Class clazz = Class.forName("com.heima.reflect.Student");


        Method[] declaredMethods = clazz.getDeclaredMethods();
        Method work = clazz.getMethod("work",String.class);

        Field[] fields = clazz.getDeclaredFields();
        for (Field s : fields) {
            System.out.println(s);

        }
    }
}
