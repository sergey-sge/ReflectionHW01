package com.gmail.sge.serejka;

public class TestClass {
    public void testOne(int a, int b){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    @MyAnnotation(param1 = 3, param2 = 1)
    public void getSum(int a, int b){
        System.out.println("Sum is " + (a + b));
    }
    @MyAnnotation(param1 = 4,param2 = 5)
    public void testTwo(int a, int b){
        System.out.println(a < b);
    }
}
