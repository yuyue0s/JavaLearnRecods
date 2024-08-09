package com.codeblock;

public class CodeBlockDetail03 {
    //构造器的最前面其实隐含了 super() 和 调用普通代码块，
    //静态相关的代码块，属性初始化在类加载时，就执行完毕,因此是优先于 构造器和普通代码块执行的
    public static void main(String[] args) {
        BBB bbb = new BBB();
        //输出顺序：
        //AAA 的普通代码块
        //AAA 构造器
        //BBB 代码块
        //BBB 构造器
    }
}
class AAA {
    {
        System.out.println("AAA 的普通代码块");
    }

    public AAA() {
        //(1)super()
        //(2)调用普通代码块
        System.out.println("AAA 构造器");
    }
}
class BBB extends AAA {

    //普通代码块
    {
        System.out.println("BBB 代码块");
    }

    public BBB() {
        //(1)super() 父类是AAA s
        //(2)调用普通代码块
        System.out.println("BBB 构造器");
    }
}