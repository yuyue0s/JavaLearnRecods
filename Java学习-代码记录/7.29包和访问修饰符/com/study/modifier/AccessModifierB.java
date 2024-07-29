package com.study.modifier;

public class AccessModifierB {
    //同包
    AccessModifierA t1 = new AccessModifierA();
    public void print(){
        ////在同一个包下，可以访问public , protected 和默认修饰属性或方法,不能访问private 属性或方法
        System.out.println(t1.n1+" "+t1.n2+" "+t1.n3);
    }
}
