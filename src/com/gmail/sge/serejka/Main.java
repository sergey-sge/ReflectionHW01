package com.gmail.sge.serejka;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        checkAnnotations(testClass);
    }

    public static void checkAnnotations (Object object){
        Class objectClass = object.getClass();
        Method [] methods = objectClass.getDeclaredMethods();
        for (Method method : methods){
            if (method.isAnnotationPresent(MyAnnotation.class)){
                System.out.println(method + " is annotated");
                int a = method.getAnnotation(MyAnnotation.class).param1();
                int b = method.getAnnotation(MyAnnotation.class).param2();
                try {
                    method.invoke(object,a,b);
                } catch (IllegalAccessException | InvocationTargetException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
