package com.study.interface_;

public class InterfaceStudy01 {
    public static void main(String[] args) {
        new A().hi();
    }
}
class A implements Ausb{
    //1. 如果一个类 implements实现 接口
    //2. 需要将该接口的所有抽象方法都实现
    public void hi(){
        System.out.println("你好");
    }
}
interface Ausb{
    //可以写属性
    public int n1 = 100;
    //可以写方法
    //在接口中，抽象方法，可以省略abstract关键字
    public void hi();

    //抽象方法不可以有方法体
    //在jdk8后，可以有默认实现方法,需要使用 default 关键字修饰
    default public void ok() {
        System.out.println("ok ...");
    }
    //在jdk8后, 可以有静态方法
    public static void cry() {
        System.out.println("cry ....");
    }
}