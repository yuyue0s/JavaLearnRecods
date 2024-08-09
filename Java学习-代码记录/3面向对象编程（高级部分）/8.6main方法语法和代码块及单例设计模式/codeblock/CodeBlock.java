package com.codeblock;
//代码块
public class CodeBlock {
    public static void main(String[] args) {
        new Person("小晴",20);
        System.out.println("=========");
        new Person("小晴","男",20);
    }

}
class Person {
    private String name;
    private int age;
    private String gender;
    //(1) 构造器都有相同的语句
    //(2) 这样代码看起来比较冗余
    //(3) 这时我们可以把相同的语句，放入到一个代码块中，即可
    //(4) 这样当我们不管调用哪个构造器，创建对象，都会先调用代码块的内容
    //(5) 代码块调用的顺序优先于构造
    //(5) 代码块调用的顺序优先于构造


    //static代码块随着类的加载而执行 并且只会执行一次。普通代码块每创建一个对象 就执行

    static {
        System.out.println("小晴6");
        System.out.println("小晴66");
        System.out.println("小晴666");
    };

    public Person(String name, int age) {
        System.out.println("String name, int age");
        this.name = name;
        this.age = age;
    }

    public Person(String name, String gender, int age) {
        System.out.println("String name, ender, int age");
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}