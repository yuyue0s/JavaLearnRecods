package com.study.polymorphic;

public class PolyMethod {
    public static void main(String[] args) {
        //方法重载体现多态
        A a = new A();
        //这里我们传入不同的参数，就会调用不同sum 方法，就体现多态
        System.out.println(a.sum(1,2));
        System.out.println(a.sum(1,2,3));
        //方法重写体现多态
        B b = new B();
        a.say();
        b.say();
    }
}
class B {
    public void say() {
        System.out.println("B 父类 方法say");
    }
}
class A extends B{
    public void say() {
        System.out.println("A 子类 方法say");
    }

    public int sum(int n1,int n2,int n3) {
        return n1 + n2 + n3;
    }

    public int sum(int n1, int n2) {
        return n1 + n2;
    }
}