package com.study.super_;
//super 代表父类的引用，用于访问父类的属性、方法、构造器
public class A{
    //4个属性
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public void cal2() {
        System.out.println(" cal2 A 父类");
    }

    public void cal(){
        System.out.println(" cal A 父类");
    }

    public void test100() {
    }

    protected void test200() {
    }

    void test300() {
    }

    private void test400() {
    }
}

