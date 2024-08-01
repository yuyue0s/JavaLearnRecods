package com.study.polymorphic.dynamic;
//java的动态绑定机制
// 1)当调用对象方法的时候，该方法会和该对象的内存地址/运行类型绑定
// 2)当调用对象属性时，没有动态绑定机制，哪里声明，那里使用
public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B();
        //1)当调用对象方法的时候，该方法会和该对象的内存地址/运行类型绑定
        System.out.println(a.sum());
        System.out.println(a.sum1());
        //2)当调用对象属性时，没有动态绑定机制，哪里声明，那里使用

    }
}
class A{
    private int n1 = 10;

    public int getN1() {
        return n1;
    }

    public int sum(){
        return getN1() + 20;
    }

    public int sum1(){
        //2)当调用对象属性时，没有动态绑定机制，哪里声明，那里使用
        return n1 + 10;
    }
}
class B extends A {
    private int n1 = 20;

    public int getN1() {
        return n1;
    }

//    public int sum(){
//        return n1 + 10;
//    }

//    public int sum1(){
//        return n1 + 10;
//    }
}