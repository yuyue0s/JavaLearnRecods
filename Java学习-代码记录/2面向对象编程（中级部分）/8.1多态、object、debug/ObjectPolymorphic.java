package com.study.polymorphic;

public class ObjectPolymorphic {
    public static void main(String[] args) {
        //一个对象的编译类型和运行类型可以不一致
        Animals animals = new Dog();
        //因为运行时, 执行到改行时，animal 运行类型是Dog,所以cry 就是Dog 的cry
        animals.cry();
        //编译类型在定义对象时，就确定了，不能改变
        //运行类型是可以变化的
        //编译类型看定义时 =号 的左边，运行类型看 =号的 右边
        animals = new Cat();
        animals.cry();
    }
}
class Animals {
    public void cry() {
        System.out.println("Animals cry");
    }
}
class Dog extends Animals {
    public void cry(){
        System.out.println("Dog cry");
    }
}
class Cat extends Animals{
    public void cry() {
        System.out.println("Cat cry");
    }
}