package com.study.static_;

public class VisitChild {
    public static void main(String[] args) {
        //static类变量，在类加载的时候就生成了
        System.out.println(A.name);

        //通过对象名.类变量名也可以访问
        A a = new A();
        System.out.println(a.name);
    }
}
class A {
    public static String name = "小晴";
}