package com.study.equals_;

import java.net.HttpRetryException;

//应用实例: 判断两个Person 对象的内容是否相等，如果两个Person 对象的各个属性值都一样，则返回true，反之false
public class EqualsExercise {
    public static void main(String[] args) {
        Person jack1 = new Person("jack",18,"男");
        Person jack2 = new Person("jack",18,"男");
        System.out.println(jack1.equals(jack2));//true
    }
}
class Person {
    private String name;
    private int age;
    private String gender;

    public boolean equals(Object obj) {
        //先判断是否是同一个对象
        if (this == obj){
            return true;
        }
        if (obj instanceof Person){
            Person p = (Person) obj;
            //在这里，p.name.equals(this.name) 和 p.gender.equals(this.gender) 中的
            //equals 方法不是使用 Object 类的 equals 方法，也不是递归调用当前方法。
            //这里是在调用 String 类的 equals 方法。
            return p.name.equals(this.name) && p.age == this.age && p.gender.equals(this.gender);
        }
        return false;
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}