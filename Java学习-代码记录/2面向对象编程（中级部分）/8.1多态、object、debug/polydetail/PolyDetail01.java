package com.study.polymorphic.polydetail;

public class PolyDetail01 {
    public static void main(String[] args) {
        //向上转型: 父类的引用指向了子类的对象
        //语法：父类类型 引用名= new 子类类型();
        Animals animals = new Dog();
        Object obj = new Dog();//可以吗? 可以。Object 也是Cat 的父类
        animals.cry();
        animals.eat(); //输出dog eat 最终运行效果看子类(运行类型)的具体实现,
        //即调用方法时，按照从子类(运行类型)开始查找方法 然后调用，规则和前面讲的方法调用规则一致
        animals.sleep();

        //向下转型:
        //(1)语法：子类类型 引用名=（子类类型）父类引用;
        //dog 的编译类型Dog,运行类型是Dog
        //(2)要求 父类的引用 必须指向的是 当前目标类型的对象
        Dog dog = (Dog) animals;
        dog.run();
        //Cat cat = (Cat) animals;//错误的

        //属性没有重写之说！属性的值看编译类型
        Animals n1 = new Dog();
        System.out.println(n1.num); //10
        Dog n2 = new Dog();
        System.out.println(n2.num); //20
        Cat n3 = new Cat();
        System.out.println(n3.num); //30

        //instanceOf 比较操作符，用于判断对象的运行类型是否为XX 类型或XX 类型的子类型
    }
}
//向上转型调用方法的规则如下:
//(1)可以调用父类中的所有成员(需遵守访问权限)
//(2)但是不能调用子类的特有的成员
//(3)因为在编译阶段，能调用哪些成员,是由编译类型来决定的
//animal.run();错误
//(4)最终运行效果看子类(运行类型)的具体实现, 即调用方法时，按照从子类(运行类型)开始查找方法
//然后调用，规则和前面讲的方法调用规则一致
class Animals {

    int num = 10;

    public void cry() {
        System.out.println("A cry");
    }
    public void eat() {
        System.out.println("A eat");
    }
    public void sleep() {
        System.out.println("A sleep");
    }
}
class Dog extends Animals {

    int num = 20;

    public void eat() {   //方法重写
        System.out.println("dog eat");
    }
    public void run() {  //特有的成员方法
        System.out.println("dog run");
    }
}
class Cat extends Animals {
    int num = 30;
}