package com.study.super_;

/**
 * 1) 编写一个Person 类，包括属性/private（name、age），构造器、方法say(返回自我介绍的字符串）。
 * 2) 编写一个Student 类，继承Person 类，增加id、score 属性/private，以及构造器，定义say 方法(返回自我介绍的信息)。
 * 3) 在main 中,分别创建Person 和Student 对象，调用say 方法输出自我介绍
 */
public class Exercise {
    public static void main(String[] args) {
        Person person = new Person("悦悦",3);
        System.out.println(person.say());
        Student student = new Student("悦总",18,"1000",80);
        System.out.println(student.say());
    }
}
class Student extends Person{
    private String id;
    private double score;

    public Student(String name, int age, String id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public String say() {
        return super.say() + " id=" + id + " score=" + score;
    }
}
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String say() {
        return "名字是" + name + " 年龄是" + age;
    }
}