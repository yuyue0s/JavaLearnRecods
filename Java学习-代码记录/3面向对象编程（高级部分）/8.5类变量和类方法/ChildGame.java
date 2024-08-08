package com.study.static_;

public class ChildGame {
    public static void main(String[] args) {
        Child xMing = new Child("小明");
        xMing.join();
        xMing.count++;

        Child xTing = new Child("小听");
        xTing.join();
        xTing.count++;

        Child xYing = new Child("小应");
        xYing.join();
        xYing.count++;

        System.out.println("共有" + Child.count  + "人参加游戏");
    }
}
class Child {
    private String name;
    //定义一个变量count 是一个类变量（静态变量） static 静态的
    //改变量的最大的特点就是会被Child类的所有对象共享
    public static int count = 0;
    public Child(String name) {
        this.name = name;
    }
    //方法加入游戏
    public void join() {
        System.out.println(name + "加入游戏……");
    }
}