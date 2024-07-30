package com.study.extend_02;

//T父类
public class T {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public T() {
        System.out.println("父类1");
    }

    public T(String name,int age) {
        System.out.println("父类2");
    }

    public void n4() {
        System.out.println(n4);
    }

    public int calln4() {
        return n4;
    }
}
