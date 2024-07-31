package com.study.override_;

public class Dog extends Animals {
    public void cry() {
        //1. 因为Dog 是Animal 子类
        //2. Dog 的cry 方法和Animal 的cry 定义形式一样(名称、返回类型、参数)
        //3. 这时我们就说Dog 的cry 方法，重写了Animal 的cry 方法
        System.out.println("Dog---cry");
    }
}
