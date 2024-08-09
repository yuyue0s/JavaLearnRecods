package com.codeblock;

public class CodeBlockDetail04 {
    public static void main(String[] args) {
        /**
         * 创建对象
         * (1)先进行类的加载
         * 1.1 先加载父类的 静态代码块 和 静态属性 （优先级一样 按定义顺序）
         * 1.2 再加载子类的 静态代码块 和 静态属性 （优先级一样 按定义顺序）
         * (2)创建对象
         * 2.1 从子类的构造器开始
         *     (1)super()
         *     (2)调用普通代码块
         */

        //静态代码块只可以调用静态成员 普通代码块可以调用任意成员
    }
}
class A01 {

}
