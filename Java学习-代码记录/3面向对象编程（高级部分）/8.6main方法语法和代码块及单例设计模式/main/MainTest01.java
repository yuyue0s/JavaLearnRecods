package com.main;

public class MainTest01 {
    //1) 在main()方法中，我们可以直接调用main 方法所在类的静态方法或静态属性。
    //2) 但是，不能直接访问该类中的非静态成员，必须创建该类的一个实例对象后，才能通过这个对象去访问类中的非静态成员
    public static String name = "小晴666";
    public static void hi() {
        System.out.println("666");
    }

    public static void main(String[] args) {
        System.out.println(name);
        MainTest01.hi();
    }
}
