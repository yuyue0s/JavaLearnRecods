package com.codeblock;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        /**
         * 创建一个对象 在一个类的调用顺序是：
         * ① 调用静态代码块 和 静态属性初始化
         * (注意:静态代码块和静态属性初始化调用的优先级一样，如果有多个静态代码块和多个静态变量初始化，则按他们定义的顺序调用)
         * ② 调用普通代码块 和 普通属性的初始化
         * (注意:普通代码块和普通属性初始化调用的优先级一样，如果有多个普通代码块和多个普通属性初始化，则按定义顺序调用)
         * ③ 调用构造方法(构造器)
         */
        A a = new A();
        //输出：
        //getN1被调用
        //A 静态代码块01
        //getN2被调用
        //A 普通代码块01
        //A 构造器被调用
    }
}
class A {
    //静态变量初始化：
    public static int n1 = getN1();
    //静态代码块
    static {
        System.out.println("A 静态代码块01");
    }
    //静态方法 类方法
    public static int getN1() {
        System.out.println("getN1被调用");
        return 100;
    }
    //普通属性的初始化：
    public int n2 = getN2();

    //普通代码块
    {
        System.out.println("A 普通代码块01");
    }

    //普通方法 非静态
    public int getN2() {
        System.out.println("getN2被调用");
        return 200;
    }

    //构造器
    public A() {
        System.out.println("A 构造器被调用");
    }
}