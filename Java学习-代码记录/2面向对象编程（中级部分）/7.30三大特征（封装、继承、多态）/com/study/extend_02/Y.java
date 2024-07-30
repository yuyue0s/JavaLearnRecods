package com.study.extend_02;

//Y子类
public class Y extends T{
    public Y() {
        super("t",2);
        //super(); 默认调用父类的无参构造器
        //子类必须调用父类的构造器， 完成父类的初始化
        System.out.println("一子类");
    }

    public Y(String name) {
        //this("t");   super() 和this() 都只能放在构造器第一行，因此这两个方法不能共存在一个构造器
        //super 只能在构造器中使用
        super("t",2);
        //super(); 默认调用父类的无参构造器
        //当创建子类对象时，不管使用子类的哪个构造器，默认情况下总会去调用父类的无参构造器
        System.out.println("二子类");
    }

    public void print() {
        //子类继承了所有的属性和方法，非私有的属性和方法可以在子类直接访问, 但是私有属性和方法不能在子类直接访
        //问，要通过父类提供公共的方法去访问
        System.out.println("n1=" + n1 + " n2=" + n2 + "n3=" + n3 + "n4在父类是private");
        System.out.println(calln4());
    }
}
